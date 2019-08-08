package cn.com.dxk.springcloud.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 〈Ribbon-负载均衡客户端〉
 *
 * @author Dingxk
 * @create 2019/8/8
 * @since 1.0.0
 */
@EnableEurekaClient
@SpringCloudApplication
public class RibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(RibbonApplication.class,args);
    }
}
