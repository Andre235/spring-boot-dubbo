package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 1.将服务提供者注册到注册中心
 * 1.1引入dubbo依赖支持、zk依赖支持
 * 1.2添加相关配置
 * 1.3使用@Service注解启用发布功能
 */
@SpringBootApplication
public class ProviderTicketApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderTicketApplication.class, args);
    }

}
