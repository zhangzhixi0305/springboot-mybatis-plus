package com.zhixi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhixi.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * @author zhangzhixi
 * @version 1.0
 * @date 2021-12-29 9:25
 */
@Repository
public interface IUserMapper extends BaseMapper<User> {
}
