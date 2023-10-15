package domain.member.controller;

import domain.member.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
@Validated
@Controller
@RequestMapping("/nice")
@Slf4j
public class MemberController {

    @Autowired
    private MemberService memberService;

    @Autowired
    PasswordEncoder passwordEncoder;


}
