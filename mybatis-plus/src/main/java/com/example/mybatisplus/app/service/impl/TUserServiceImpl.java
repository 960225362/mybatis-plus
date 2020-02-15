package com.example.mybatisplus.app.service.impl;

import com.example.mybatisplus.app.entity.TUser;
import com.example.mybatisplus.app.mapper.TUserMapper;
import com.example.mybatisplus.app.service.ITUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author shanshanlaichi
 * @since 2020-02-14
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements ITUserService {

}
