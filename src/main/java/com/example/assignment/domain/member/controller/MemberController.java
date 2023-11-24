package com.example.assignment.domain.member.controller;

import com.example.assignment.domain.member.entity.Member;
import com.example.assignment.domain.member.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Validated
@Controller
@Slf4j
public class MemberController {


    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    MemberService memberService;

    @GetMapping("/signup")
    public String signupForm(Model model) {
        model.addAttribute("member", new Member());
        return "signup";
    }

    // 회원가입 메소드
    @PostMapping("/signup")
    public String signup(@RequestParam("username") String username,
                         @RequestParam("password")String password){

        int result = memberService.createMember(username, password);
        System.out.println("asdaslkdjsaldjsalkdjsaldjsalkjdlaksjdlkasjdlskajdlaksjkl");

        return "redirect:/login";
    }

    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute("member", new Member());
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password")String password) {
        // 로그인 성공 시 메시지를 콘솔에 출력
        System.out.println("Login successful!");

        // 추가로 모델에 데이터를 추가하거나 다른 작업을 수행할 수 있음
        int result = memberService.selectmember(username, password);

        // 로그인 성공 후에 welcome 페이지로 리다이렉트
        return "redirect:/welcome";
    }



    @GetMapping("/welcome")
    public String welcome() {
        return "welcome"; // Return the name of the welcome view (HTML template)
    }


}
