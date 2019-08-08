package cn.com.dxk.springcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 〈注册中心启动类〉
 *
 * @author Dingxk
 * @create 2019/8/7
 * @since 1.0.0
 */
@SpringCloudApplication
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class,args);
    }
}
