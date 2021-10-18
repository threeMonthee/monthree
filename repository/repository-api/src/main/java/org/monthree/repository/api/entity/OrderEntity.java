package org.monthree.repository.api.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author monthree
 * Created on 2021/10/3 3:37 PM
 **/
@Setter
@Getter
@TableName("o_order")
public class OrderEntity extends Entity<Long>
{
    private Long uid;
    private String title;
    private BigDecimal money;
    //0创建,1已支付
    private Integer status;
}
