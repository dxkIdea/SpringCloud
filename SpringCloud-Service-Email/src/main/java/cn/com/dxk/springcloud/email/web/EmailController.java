package cn.com.dxk.springcloud.email.web;

import cn.com.dxk.springcloud.email.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ClassUtils;
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
    @Autowired
    private MailService mailService;
    @RequestMapping(value = "email")
    public void email () {
        /**
         * 发送简单纯文本邮件
         */
        mailService.sendSimpleMail("17600299358@163.com","测试邮件","祝：身体健康");

        /**
         * 发送HTML邮件
         */
        String content1 = "<html><body><h3><font color=\"red\">" + "大家好，这是springboot发送的HTML邮件" + "</font></h3></body></html>";
        mailService.sendHtmlMail("17600299358@163.com","测试邮件",content1);

        /**
         * 发送带附件的邮件
         */
        String content2 = "<html><body><h3><font color=\"red\">" + "大家好，这是springboot发送的HTML邮件，有附件哦" + "</font></h3></body></html>";
        String path = "D:\\env-software\\workspace-ALL\\java\\SpringCloud\\SpringCloud-Service-Email\\src\\main\\resources\\images\\logo.png";
        mailService.sendAttachmentMail("17600299358@163.com","测试邮件",content2,path);

        /**
         * 发送带图片的邮件
         */
        String rscId = "001";
        String content = "<html><body><h3><font color=\"red\">" + "大家好，这是springboot发送的HTML邮件，有图片哦" + "</font></h3>"
                + "<img src=\'cid:" + rscId + "\'></body></html>";
        mailService.sendInlineResourceMail("17600299358@163.com", "测试邮件", content, path, rscId);

    }
}
