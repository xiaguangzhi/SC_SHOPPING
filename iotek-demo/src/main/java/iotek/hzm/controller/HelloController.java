package iotek.hzm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xiaohuang on 2018/3/29.
 * ----------------The heart withered--------
 */
@RestController
public class HelloController {
    @GetMapping(value = "")
    public String   hello(){
        return "hello world";
    }
}
