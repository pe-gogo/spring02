package com.controller;


import com.POJO.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/User")
@Controller
public class UserController {

    @ResponseBody
    @RequestMapping("/save")
    public String save(){
        System.out.println("save");
        return "{'method':'save'}";
    }

    @ResponseBody
    @GetMapping("sep")
    public String sep(User user){

        System.out.println("sep");
        return"7777";
    }
}
