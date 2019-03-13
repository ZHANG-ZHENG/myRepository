package com.session;


import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
public class SessionController {

    @RequestMapping("/session/set")
    private String set(HttpSession session) {
    	Random r = new Random();
    	int val = r.nextInt(100);
    	session.setAttribute("key", val+"");
    	return val+"";
    }
    @RequestMapping("/session/get")
    private String get(HttpSession session) {

    	String val = (String) session.getAttribute("key");
    	return val;
    }
}
