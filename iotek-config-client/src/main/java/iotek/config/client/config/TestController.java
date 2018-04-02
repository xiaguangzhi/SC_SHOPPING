package iotek.config.client.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xiaohuang on 2018/4/2.
 * ----------------The heart withered--------
 */
@RefreshScope
@RestController
public class TestController {
    @Value("${from}")
    private  String from;
    @GetMapping("/from")
    public   String from(){
        return  this.from;
    }
}
