package org.monthree.repository.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author monthree
 * Created on 2021/10/1 8:56 PM
 **/

@Setter
@Getter
public class Entity<ID extends Serializable> implements Serializable
{
    @TableId(type = IdType.AUTO)
    private ID id;
    private Long createTime;
}
