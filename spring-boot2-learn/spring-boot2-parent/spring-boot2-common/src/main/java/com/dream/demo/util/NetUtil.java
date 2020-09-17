package com.dream.demo.util;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetUtil {

	/**
	 * 获取用户真实IP地址
	 *
	 * @param request
	 * @return ip
	 */
	public static String getIp(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("HTTP_CLIENT_IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("HTTP_X_FORWARDED_FOR");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		// 不管转发多少次，取第一位
		return ip.split(",")[0];
	}

	/**
	 * 获取来访者的浏览器版本
	 *
	 * @param request
	 * @return 浏览器版本
	 */
	public static String getBrowserInfo(HttpServletRequest request) {
		String header = request.getHeader("user-agent");
		if (header == null || header.equals("")) {
			return "";
		}
		if (header.indexOf("MSIE") > 0) {
			return "IE";
		}
		if (header.indexOf("Firefox") > 0) {
			return "Firefox";
		}
		if (header.indexOf("Chrome") > 0) {
			return "Chrome";
		}
		if (header.indexOf("Safari") > 0) {
			return "Safari";
		}
		if (header.indexOf("Camino") > 0) {
			return "Camino";
		}
		if (header.indexOf("Konqueror") > 0) {
			return "Konqueror";
		}
		return "";
	}

	/**
	 * 获取系统版本信息
	 *
	 * @param request
	 * @return 系统信息
	 */
	public static String getSystemInfo(HttpServletRequest request) {
		String header = request.getHeader("user-agent");
		if (header == null || header.equals("")) {
			return "";
		}
		// 得到用户的操作系统
		if (header.indexOf("NT 6.0") > 0) {
			return "Windows Vista/Server 2008";
		}
		if (header.indexOf("NT 5.2") > 0) {
			return "Windows Server 2003";
		}
		if (header.indexOf("NT 5.1") > 0) {
			return "Windows XP";
		}
		if (header.indexOf("NT 6.1") > 0) {
			return "Windows 7";
		}
		if (header.indexOf("NT 6.2") > 0) {
			return "Windows Slate";
		}
		if (header.indexOf("NT 6.3") > 0) {
			return "Windows 9";
		}
		if (header.indexOf("NT 5") > 0) {
			return "Windows 2000";
		}
		if (header.indexOf("NT 4") > 0) {
			return "Windows NT4";
		}
		if (header.indexOf("Me") > 0) {
			return "Windows Me";
		}
		if (header.indexOf("98") > 0) {
			return "Windows 98";
		}
		if (header.indexOf("95") > 0) {
			return "Windows 95";
		}
		if (header.indexOf("Mac") > 0) {
			return "Mac";
		}
		if (header.indexOf("Unix") > 0) {
			return "UNIX";
		}
		if (header.indexOf("Linux") > 0) {
			return "Linux";
		}
		if (header.indexOf("SunOS") > 0) {
			return "SunOS";
		}
		return header;
	}

	/**
	 * 获取来访者的主机名称
	 *
	 * @param ip
	 * @return hostname
	 */
	public static String getHostName(String ip) {
		InetAddress inet;
		try {
			inet = InetAddress.getByName(ip);
			return inet.getHostName();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		return "";
	}

	/**
	 * 命令获取mac地址
	 *
	 * @param cmd
	 * @return
	 */
	private static String callCmd(String[] cmd) {
		String result = "";
		String line = "";
		try {
			Process proc = Runtime.getRuntime().exec(cmd);
			InputStreamReader is = new InputStreamReader(proc.getInputStream());
			BufferedReader br = new BufferedReader(is);
			while ((line = br.readLine()) != null) {
				result += line;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * @param cmd     第一个命令
	 * @param another 第二个命令
	 * @return 第二个命令的执行结果
	 */
	private static String callCmd(String[] cmd, String[] another) {
		String result = "";
		String line = "";
		try {
			Runtime rt = Runtime.getRuntime();
			Process proc = rt.exec(cmd);
			proc.waitFor(); // 已经执行完第一个命令，准备执行第二个命令
			proc = rt.exec(another);
			InputStreamReader is = new InputStreamReader(proc.getInputStream());
			BufferedReader br = new BufferedReader(is);
			while ((line = br.readLine()) != null) {
				result += line;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * @param ip           目标ip,一般在局域网内
	 * @param sourceString 命令处理的结果字符串
	 * @param macSeparator mac分隔符号
	 * @return mac地址，用上面的分隔符号表示
	 */
	private static String filterMacAddress(final String ip, final String sourceString, final String macSeparator) {
		String result = "";
		String regExp = "((([0-9,A-F,a-f]{1,2}" + macSeparator + "){1,5})[0-9,A-F,a-f]{1,2})";
		Pattern pattern = Pattern.compile(regExp);
		Matcher matcher = pattern.matcher(sourceString);
		while (matcher.find()) {
			result = matcher.group(1);
			if (sourceString.indexOf(ip) <= sourceString.lastIndexOf(matcher.group(1))) {
				break; // 如果有多个IP,只匹配本IP对应的Mac.
			}
		}
		return result;
	}

	/**
	 * @param ip 目标ip
	 * @return Mac Address
	 */
	private static String getMacInWindows(final String ip) {
		String result = "";
		String[] cmd = { "cmd", "/c", "ping " + ip };
		String[] another = { "cmd", "/c", "arp -a" };
		String cmdResult = callCmd(cmd, another);
		result = filterMacAddress(ip, cmdResult, "-");
		return result;
	}

	/**
	 * @param ip 目标ip
	 * @return Mac Address
	 */
	private static String getMacInLinux(final String ip) {
		String result = "";
		String[] cmd = { "/bin/sh", "-c", "ping " + ip + " -c 2 && arp -a" };
		String cmdResult = callCmd(cmd);
		result = filterMacAddress(ip, cmdResult, ":");
		return result;
	}

	/**
	 * 获取MAC地址
	 *
	 * @return 返回MAC地址
	 */
	public static String getMacAddress(String ip) {
		String macAddress = "";
		macAddress = getMacInWindows(ip).trim();
		if (macAddress == null || "".equals(macAddress)) {
			macAddress = getMacInLinux(ip).trim();
		}
		return macAddress;
	}
}
