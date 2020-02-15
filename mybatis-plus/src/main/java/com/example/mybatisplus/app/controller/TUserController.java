package com.example.mybatisplus.app.controller;


import com.example.mybatisplus.app.entity.TUser;
import com.example.mybatisplus.app.service.ITUserService;
import com.example.mybatisplus.app.service.impl.TUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import com.example.mybatisplus.base.BaseController;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author shanshanlaichi
 * @since 2020-02-14
 */
@RestController
@RequestMapping("/app/t-user")
public class TUserController extends BaseController {
    @Autowired
    private ITUserService itUserService;

    @GetMapping("getUser")
    public String getUser(){
        TUser user = new TUser();
        user.setName("测试");
        user.setPassword("123");
        user.setPhone("18345466778");
        itUserService.save(user);
        return "shanshanlaichi";
    }
}
