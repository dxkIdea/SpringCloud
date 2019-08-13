package cn.com.dxk.springcloud.feign.web;

import cn.com.dxk.springcloud.feign.service.QRCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QRCodeController {
    @Autowired
    private QRCodeService qrCodeService;
    @RequestMapping(value = "qrcode")
    public String getQrCode (@RequestParam String content) {
        return qrCodeService.getQrCode(content);
    }

    @RequestMapping(value = "hello")
    public String hello() {
        return qrCodeService.hello();
    }
}
