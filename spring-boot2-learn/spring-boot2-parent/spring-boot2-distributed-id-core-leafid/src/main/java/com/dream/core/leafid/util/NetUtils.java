package com.dream.core.leafid.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetAddress;

/**
 * 网络相关工具类， 获取id地址等
 * @author 20172462
 */
public class NetUtils {
    private static final Logger logger = LoggerFactory.getLogger(NetUtils.class);
    
    public static String getIp() {
        String ip;
        try {
            InetAddress address = InetAddress.getLocalHost();
            ip = address.getHostAddress();
        } catch(Exception ex) {
            ip = "";
            logger.warn("Utils get IP warn", ex);
        }
        return ip;
    }
}
