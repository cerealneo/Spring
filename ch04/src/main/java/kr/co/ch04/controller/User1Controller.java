package kr.co.ch04.controller;

import kr.co.ch04.dto.User1DTO;
import kr.co.ch04.service.User1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class User1Controller {


    private User1Service service;

    // 생성자 주입
    @Autowired
    public User1Controller(User1Service service) {
        this.service = service;
    }


    @RequestMapping(value = "/user1/list", method = RequestMethod.GET)
    public String list(){
        return "/user1/list";
    }

    @GetMapping("/user1/register")
    public String register(){
        return "/user1/register";
    }

    @PostMapping("/user1/register")
    public String register(User1DTO dto){
        System.out.println(dto);

        // 서비스 호출
        service.save(dto);

        // 리다이렉트 이동
        return "redirect:/user1/list";
    }

    @GetMapping("/user1/modify")
    public String modify(){
        return "/user1/modify";
    }

}