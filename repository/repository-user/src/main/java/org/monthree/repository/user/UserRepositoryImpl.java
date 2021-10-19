package org.monthree.repository.user;

import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.rpc.service.GenericException;
import org.apache.dubbo.rpc.service.GenericService;
import org.monthree.repository.api.UserRepository;
import org.monthree.repository.api.entity.UserEntity;
import org.monthree.repository.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author monthree
 * Created on 2021/10/3 3:36 PM
 **/

@DubboService
public class UserRepositoryImpl implements UserRepository, GenericService
{
    @Autowired
    UserMapper userMapper;

    @Override
    public UserEntity insert(UserEntity entity)
    {
        userMapper.insert(entity);
        return entity;
    }

    @Override
    public UserEntity findById(Long id)
    {
        return userMapper.selectById(id);
    }

    @Override
    public void update(UserEntity entity)
    {
        userMapper.updateById(entity);
    }

    @Override
    public Object $invoke(String method, String[] parameterTypes, Object[] args) throws GenericException
    {
        return null;
    }
}
