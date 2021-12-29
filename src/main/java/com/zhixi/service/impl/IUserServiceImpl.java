package com.zhixi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhixi.mapper.IUserMapper;
import com.zhixi.pojo.User;
import com.zhixi.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @author zhangzhixi
 * @version 1.0
 * @date 2021-12-29 9:29
 */
@Service
public class IUserServiceImpl extends ServiceImpl<IUserMapper, User> implements IUserService {
}
