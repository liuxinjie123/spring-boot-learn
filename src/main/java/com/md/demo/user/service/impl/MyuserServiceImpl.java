package com.md.demo.user.service.impl;

import com.md.demo.user.entity.vo.Myuser;
import com.md.demo.user.dao.MyuserMapper;
import com.md.demo.user.service.IMyuserService;
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
public class MyuserServiceImpl extends ServiceImpl<MyuserMapper, Myuser> implements IMyuserService {

}
