package cn.com.dxk.springcloud.email.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈邮件服务控制层〉
 *
 * @author Dingxk
 * @create 2019/8/8
 * @since 1.0.0
 */
@RestController
public class EmailController {
    @RequestMapping(value = "email")
    public String email () {
        return "email Service";
    }
}
