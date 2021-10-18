package org.monthree.repository.api;

import org.monthree.repository.api.entity.UserEntity;

/**
 * @author monthree
 * Created on 2021/10/1 8:56 PM
 **/
public interface UserRepository
{
    UserEntity insert(UserEntity entity);

    UserEntity findById(Long id);

    void update(UserEntity entity);
}
