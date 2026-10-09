package com.shop.controller;

import com.shop.dto.MemberDTO;
import com.shop.service.MemberService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
@Slf4j
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/login")
    public String login() {
        return "member/login";
    }

    @PostMapping("/login")
    public String login(@RequestParam("email") String email, @RequestParam("pwd") String pwd, RedirectAttributes redirectAttributes, HttpServletRequest request) {

        MemberDTO memberDTO = memberService.login(email, pwd);

        if (memberDTO == null) {
            redirectAttributes.addFlashAttribute("message", "아이디 또는 비밀번호가 일치하지 않습니다.");
            return "redirect:/member/login";
        }

        HttpSession session = request.getSession();
        session.setAttribute("loginMember", memberDTO);
        redirectAttributes.addFlashAttribute("msg", memberDTO.getName() + "님 로그인 되었습니다.");

        return "redirect:/product/list";
    }
}
