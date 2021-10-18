package org.monthree.service.user;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.dubbo.config.annotation.DubboReference;
import org.monthree.repository.api.OrderRepository;
import org.monthree.repository.api.UserRepository;
import org.monthree.repository.api.entity.OrderEntity;
import org.monthree.repository.api.entity.UserEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @author monthree
 * Created on 2021/10/3 3:56 PM
 **/

@Component
public class SeataTestTask
{
    @DubboReference
    UserRepository userRepository;
    @DubboReference
    OrderRepository orderRepository;

    @Scheduled(fixedDelay = 100000)
    public void order() throws JsonProcessingException
    {
        UserEntity userEntity = new UserEntity();
        userEntity.setName("zhangsan");
        userEntity.setToken("aqwmkl21kl3ij12ij3123");
        userEntity.setCreateTime(System.currentTimeMillis());
        userEntity = userRepository.insert(userEntity);

        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setCreateTime(System.currentTimeMillis());
        orderEntity.setStatus(0);
        orderEntity.setMoney(new BigDecimal("20.00"));
        orderEntity.setTitle("充值");
        orderEntity.setUid(userEntity.getId());
        orderEntity = orderRepository.insert(orderEntity);

        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println(objectMapper.writeValueAsString(userRepository.findById(userEntity.getId())));
        System.out.println(objectMapper.writeValueAsString(orderRepository.findById(orderEntity.getId())));

    }
}
