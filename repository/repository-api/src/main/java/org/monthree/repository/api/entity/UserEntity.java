package org.monthree.repository.api.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

/**
 * @author monthree
 * Created on 2021/10/1 8:56 PM
 **/

@TableName("user")
@Setter
@Getter
public class UserEntity extends Entity<Long>
{
    private String name;
    private String token;
}
