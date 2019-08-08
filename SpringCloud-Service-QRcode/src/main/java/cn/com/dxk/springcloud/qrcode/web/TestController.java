package cn.com.dxk.springcloud.qrcode.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈测试请求入口〉
 *
 * @author Dingxk
 * @create 2019/8/8
 * @since 1.0.0
 */
@RestController
public class TestController {
    @Value("${server.port}")
    String port;

    @RequestMapping(value = "test")
    public String hello () {
        return "Hello World";
    }

    @RequestMapping("/hello")
    public String home(@RequestParam(value = "name", defaultValue = "dxk") String name) {
        return "hello " + name + " , I am from port: " + port;
    }
}
