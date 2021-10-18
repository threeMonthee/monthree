package org.monthree.repository.order;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author monthree
 * Created on 2021/10/3 5:24 PM
 **/

@EnableDubbo
@MapperScan("org.monthree.repository.order.mapper")
@SpringBootApplication(scanBasePackages = "org.monthree")
public class RepositoryOrderApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(RepositoryOrderApplication.class, args);
    }
}
