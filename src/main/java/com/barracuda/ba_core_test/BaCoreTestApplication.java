package com.barracuda.ba_core_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(scanBasePackages = {"com.ruoyi", "com.barracuda"}, exclude = {DataSourceAutoConfiguration.class})
public class BaCoreTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaCoreTestApplication.class, args);
    }

}
