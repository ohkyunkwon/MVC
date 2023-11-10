package hello.servlet.web.frontcontroller.v2.controller;

import hello.servlet.web.frontcontroller.MyView;
import hello.servlet.web.frontcontroller.v2.ControllerV2;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class MemberFormControllerV2 implements ControllerV2 {
    @Override
    public MyView process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /* 기존 코드
        String viewPath = "/WEB-INF/views/new-form.jsp";
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);//컨트롤러 에서 뷰로 이동시킬때 사용
        dispatcher.forward(request, response);
         */
        return new MyView("/WEB-INF/views/new-form.jsp"); // 변경된 코드
        /* option + T 누르고 inline 으로 한줄도 변경
        MyView myView = new MyView("/WEB-INF/views/new-form.jsp");
        return myView;
         */
    }
}
