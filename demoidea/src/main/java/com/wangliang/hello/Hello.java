package com.wangliang.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @RequestMapping("idea")
    public String some(){
        return "Hello idea!!!!!!!!!!!!!!!!";
    }
}
