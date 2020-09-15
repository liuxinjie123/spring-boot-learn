package com.md.demo.order.service.impl;

import com.md.demo.order.entity.vo.Info;
import com.md.demo.order.dao.InfoMapper;
import com.md.demo.order.service.IInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jack
 * @since 2020-09-15
 */
@Service
public class InfoServiceImpl extends ServiceImpl<InfoMapper, Info> implements IInfoService {

}
