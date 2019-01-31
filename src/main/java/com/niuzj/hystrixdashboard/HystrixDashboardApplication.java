package com.niuzj.hystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
//开启hystrix仪表盘,监控
@EnableHystrixDashboard
public class HystrixDashboardApplication {

    /**
     * hystrix dashboard
     * hystrix监控系统
     * 访问项目/hystrix可看到监控页面
     * 在页面的第一个输入框输入要进行监控的项目的路径, 如:http://localhost:9999/hystrix.stream
     * 点击Monitor Stream即可看到结果
     */
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardApplication.class, args);
    }

}

