package com.zhixi;

import com.zhixi.pojo.User;
import com.zhixi.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Springboot07MybatisPlusApplicationTests {

    @Autowired
    IUserService userService;

    @Test
    void contextLoads() {
        List<User> list = userService.getBaseMapper().selectList(null);
        list.forEach(System.out::println);
    }
}
