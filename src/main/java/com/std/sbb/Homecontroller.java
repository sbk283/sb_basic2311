package com.std.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class Homecontroller {
    @GetMapping("/home/main1")
    public String ShowMain(){
        return "안녕하세요";
    }
    @GetMapping("/home/main2")
    public String ShowMain2(){
        return "반갑습니다.";
    }
    @GetMapping("/home/main3")
    public String ShowMain3(){
        return "즐거웠습니다.";
    }
}
