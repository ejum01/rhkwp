package com.example.assignment;

import com.example.assignment.domain.member.entity.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Slf4j
public class PingPing2 {

    @GetMapping("")
    public String mainHtml(Model model) {
        model.addAttribute("message", "Hello 안냥~");
        return "main.html";
    }



    @GetMapping("/ping")
    public ResponseEntity<String> pingcontroller() {
        return ResponseEntity.ok("pong");
    }
}
