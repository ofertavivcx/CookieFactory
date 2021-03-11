package com.checkmarx.cookiefactory.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@Slf4j
public class HomeController {

    @RequestMapping("/home")
    public String bankStorageIndex() {
        return "Welcome to Cookie Factory";
    }

    @RequestMapping("/")
    public String showWelcomePage() {
        return "Welcome to Cookie Factory";
    }
}
