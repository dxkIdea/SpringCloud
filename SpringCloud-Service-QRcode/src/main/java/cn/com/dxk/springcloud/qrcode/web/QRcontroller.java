package cn.com.dxk.springcloud.qrcode.web;

import cn.com.dxk.springcloud.qrcode.utils.QrCodeUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;

/**
 * 〈二维码请求入口类〉
 *
 * @author Dingxk
 * @create 2019/8/8
 * @since 1.0.0
 */
@Controller
public class QRcontroller {
    /**
     * 二维码
     * @param request
     * @param response
     */
    @RequestMapping("/qrcode")
    public void qrcode(HttpServletRequest request, HttpServletResponse response) {
        StringBuffer url = request.getRequestURL();
        // 域名
        String tempContextUrl = url.delete(url.length() - request.getRequestURI().length(), url.length()).append("/").toString();
        // 再加上请求链接
        String requestUrl = tempContextUrl + "test";
        try {
            OutputStream os = response.getOutputStream();
            QrCodeUtils.encode(requestUrl, "/static/images/logo.png", os, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
