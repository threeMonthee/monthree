package org.monthree.repository.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author monthree
 * Created on 2021/10/1 8:48 PM
 **/

@MapperScan("org.monthree.mapper")
@SpringBootApplication(scanBasePackages = "org.monthree")
public class RepositoryUserApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(RepositoryUserApplication.class, args);
    }
}
