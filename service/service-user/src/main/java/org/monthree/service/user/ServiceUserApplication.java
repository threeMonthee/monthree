package org.monthree.service.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author monthree
 * Created on 2021/10/3 3:49 PM
 **/

@EnableScheduling
@SpringBootApplication
public class ServiceUserApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(ServiceUserApplication.class, args);
    }
}
