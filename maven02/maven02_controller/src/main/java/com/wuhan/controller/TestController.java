package com.wuhan.controller;

import com.wuhan.domain.Iteams;

import com.wuhan.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/test")
public class TestController {


    @Autowired
    TestService testService;

    @RequestMapping("/find")
    public String find() {
        testService.save ();
        System.out.println (123);
        return "../success.jsp";
    }

    @RequestMapping("/findAll")
    public ModelAndView findAll() {
        ModelAndView modelAndView = new ModelAndView ();
        List<Iteams> tests = testService.find ();
        System.out.println (tests);

        modelAndView.addObject ("tests", tests);
        modelAndView.setViewName ("test");
        return modelAndView;
    }
}
