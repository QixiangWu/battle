package com.yibing.generator.service.impl;

import com.yibing.generator.entity.Users;
import com.yibing.generator.mapper.UsersMapper;
import com.yibing.generator.service.UsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author caochenlei
 * @since 2023-01-31
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {

}
