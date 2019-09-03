package cn.com.dxk.springcloud.config.client.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {
    @Value("${name}")
    private String name;

    @Value("${age}")
    private String age;

    @RequestMapping(value = "test")
    public String test () {
        return "配置中心配置--> 姓名为： " + name + ", 年龄为： " + age;
    }
}
