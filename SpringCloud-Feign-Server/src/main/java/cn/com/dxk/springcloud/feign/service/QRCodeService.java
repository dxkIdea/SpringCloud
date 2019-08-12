package cn.com.dxk.springcloud.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "QRcode")
public interface QRCodeService {
    @RequestMapping(value = "/qrcode")
    String getQrCode (@RequestParam(value = "content") String content);
}
