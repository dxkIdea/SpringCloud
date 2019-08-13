package cn.com.dxk.springcloud.feign.service;

import org.springframework.stereotype.Component;

@Component
public class QRCodeServiceHystrix implements QRCodeService{
    @Override
    public String getQrCode(String content) {
        return null;
    }

    @Override
    public String hello() {
        return "Hello is down";
    }
}
