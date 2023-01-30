package com.yibing.generator.store.service.impl;

import com.yibing.generator.store.entity.Users;
import com.yibing.generator.store.mapper.UsersMapper;
import com.yibing.generator.store.service.UsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yibing
 * @since 2023-01-18
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {

}
