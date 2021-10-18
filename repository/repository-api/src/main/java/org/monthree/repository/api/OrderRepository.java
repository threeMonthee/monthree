package org.monthree.repository.api;

import org.monthree.repository.api.entity.OrderEntity;

/**
 * @author monthree
 * Created on 2021/10/3 3:38 PM
 **/
public interface OrderRepository
{
    OrderEntity insert(OrderEntity entity);

    OrderEntity findById(Long id);

    void update(OrderEntity entity);
}
