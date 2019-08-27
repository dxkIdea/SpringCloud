package cn.com.dxk.springcloud.ribbon.web;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonTestController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "test")
    @HystrixCommand(fallbackMethod = "error")
    public String test () {
        return restTemplate.postForObject("http://QRCODE/hello",null,String.class);
    }

    public String error () {
        return "sorrt, i am down!";
    }
}
