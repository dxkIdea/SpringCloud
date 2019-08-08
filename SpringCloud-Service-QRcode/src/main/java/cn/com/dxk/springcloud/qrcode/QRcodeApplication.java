package cn.com.dxk.springcloud.qrcode;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 〈服务提供者-生成二维码，启动类〉
 *
 * @author Dingxk
 * @create 2019/8/8
 * @since 1.0.0
 */
@SpringCloudApplication
@EnableEurekaClient
public class QRcodeApplication {
    public static void main(String[] args) {
        SpringApplication.run(QRcodeApplication.class,args);
    }
}
