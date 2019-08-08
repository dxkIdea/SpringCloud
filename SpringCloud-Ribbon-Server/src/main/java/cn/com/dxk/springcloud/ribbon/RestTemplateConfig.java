package cn.com.dxk.springcloud.ribbon;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.client.RestTemplate;

/**
 * 〈RestTemplate-初始化〉
 *
 * @author Dingxk
 * @create 2019/8/8
 * @since 1.0.0
 */
@Configuration
public class RestTemplateConfig {
    /**
     * 将RestTemplate由Spring容器管理，并启动负载均衡
     * @return
     */
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
