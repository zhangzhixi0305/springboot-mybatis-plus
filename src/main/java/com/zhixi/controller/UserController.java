package com.zhixi.controller;

import com.zhixi.pojo.User;
import com.zhixi.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author zhangzhixi
 * @version 1.0
 * @date 2021-12-29 9:16
 */
@Controller
public class UserController {

    @Autowired
    IUserService userService;

    /**
     * 查询所有用户
     *
     * @return 所有用户的数据
     */
    @ResponseBody
    @GetMapping("/userAll")
    public List<User> selAllUser() {
        return userService.getBaseMapper().selectList(null);
    }


    /**
     * 根据ID查询用户
     *
     * @return 根据ID查询到的用户数据
     */
    @ResponseBody
    @GetMapping("/userById")
    public User selectUserById() {
        return userService.getBaseMapper().selectById(1);
    }


    @ResponseBody
    @GetMapping("/hello")
    public String test() {
        return "hello";
    }
}
