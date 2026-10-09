package com.shop.filter;


import com.shop.dto.MemberDTO;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class LoginFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        HttpSession session = httpRequest.getSession();
        MemberDTO memberDTO = (MemberDTO) session.getAttribute("loginMember");

        if (memberDTO == null) {
            httpResponse.sendRedirect("/member/login");
            return;
        }

        chain.doFilter(request, response);
    }
}
