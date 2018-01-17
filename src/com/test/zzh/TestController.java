package com.test.zzh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

/**
 * Created by 二狗子 on 2018/1/16 0016.
 */
@Controller
public class TestController {
    @RequestMapping("/hello")
    public String helloWorld(){
        return "test/hello.jsp";
    }
}
