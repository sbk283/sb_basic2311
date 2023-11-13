package com.std.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.yaml.snakeyaml.nodes.ScalarNode;

import java.util.Scanner;

@Controller
@ResponseBody
public class Homecontroller {
    private int number;
    Scanner sc = new Scanner(System.in);
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
    @GetMapping("/home/increase")
    public int ShowIncrease(){
        number++;
        return number;
    }
    @GetMapping("/home/plus")
    @ResponseBody
    public int ShowPlus(@RequestParam(defaultValue = "0") int a, @RequestParam(defaultValue = "0") int b) {
        return a + b;
    }
    @GetMapping("/home/minus")
    @ResponseBody
    public int ShowMinus(@RequestParam(defaultValue = "0") int a, @RequestParam(defaultValue = "0") int b) {
        return a - b;
    }
    @GetMapping("/home/Multiply")
    @ResponseBody
    public int ShowMultiply(@RequestParam(defaultValue = "0") int a, @RequestParam(defaultValue = "0") int b) {
        return a * b;
    }
    @GetMapping("/home/Divide")
    @ResponseBody
    public int ShowDivide(@RequestParam(defaultValue = "0") int a, @RequestParam(defaultValue = "0") int b) {
        return a / b;
    }
}
