package org.monthree.repository.order;

import org.apache.dubbo.config.annotation.DubboService;
import org.monthree.repository.api.OrderRepository;
import org.monthree.repository.api.entity.OrderEntity;
import org.monthree.repository.order.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author monthree
 * Created on 2021/10/3 3:39 PM
 **/

@DubboService
public class OrderRepositoryImpl implements OrderRepository
{
    @Autowired
    OrderMapper orderMapper;

    @Override
    public OrderEntity insert(OrderEntity entity)
    {
        return orderMapper.insert(entity) > 0 ? entity : null;
    }

    @Override
    public OrderEntity findById(Long id)
    {
        return orderMapper.selectById(id);
    }

    @Override
    public void update(OrderEntity entity)
    {
        orderMapper.updateById(entity);
    }
}
