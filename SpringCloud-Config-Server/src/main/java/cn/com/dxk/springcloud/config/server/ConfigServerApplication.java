package cn.com.dxk.springcloud.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringCloudApplication
@EnableConfigServer
@RestController
public class ConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class,args);
    }

    /**
     * 刷新
     */
    @RequestMapping(value = "refresh")
    public void refreshConfig() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        //设置content_type为json要不然会报415的错误
        httpHeaders.add(HttpHeaders.CONTENT_TYPE,"application/json");
        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(null,httpHeaders);
        //以post方法访问真正的刷新链接
        ResponseEntity<String> stringResponseEntity = restTemplate.postForEntity("http://localhost:8084/actuator/bus-refresh",
                request, String.class);
    }
}
