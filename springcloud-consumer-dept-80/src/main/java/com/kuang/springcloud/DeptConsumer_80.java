package com.kuang.springcloud;

import com.kuang.myrule.KuangRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

//Ribbon和Eureka整合以后，客户端可以直接调用，不用关心ip地址和端口号
@SpringBootApplication
@EnableEurekaClient
//在微服务启动时候就能加载自定义的Ribbon类
@RibbonClient(name = "SPRINGCLOUD-PROVIDER-DEPT", configuration = KuangRule.class)
public class DeptConsumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_80.class, args);
    }
}
