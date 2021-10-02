package org.monthree.repository.api.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * @author monthree
 * Created on 2021/10/1 8:56 PM
 **/

@Setter
@Getter
public class UserEntity extends Entity<Long>
{
    private String name;
    private String token;
}
