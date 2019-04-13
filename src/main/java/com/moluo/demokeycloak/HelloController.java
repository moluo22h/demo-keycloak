package com.moluo.demokeycloak;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zzh
 * @date 2019/4/13
 */
@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    @GetMapping("/")
    public String Hello() {
        return "hello";
    }
}
