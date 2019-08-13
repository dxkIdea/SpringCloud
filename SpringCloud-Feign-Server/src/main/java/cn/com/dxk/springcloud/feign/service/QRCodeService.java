package cn.com.dxk.springcloud.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "QRcode", fallback = QRCodeServiceHystrix.class)
public interface QRCodeService {
    @RequestMapping(value = "/qrcode")
    String getQrCode (@RequestParam(value = "content") String content);

    @RequestMapping(value = "/hello")
    String hello ();


}
