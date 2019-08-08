package cn.com.dxk.springcloud.email;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 〈邮件服务启动类〉
 *
 * @author Dingxk
 * @create 2019/8/8
 * @since 1.0.0
 */
@EnableEurekaClient
@SpringCloudApplication
public class EmailApplication {
    public static void main(String[] args) {
        SpringApplication.run(EmailApplication.class,args);
    }
}
