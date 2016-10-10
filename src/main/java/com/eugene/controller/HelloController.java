package com.eugene.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by DCLab on 2016/10/10.
 */
@RestController
@RequestMapping("/")
public class HelloController {
    @Value("${web.author}")
    private String webAuthor;
    @Value("${web.name}")
    private String webName;

    @RequestMapping(method = RequestMethod.GET)
    public String hello(){
        return "Web name: "+webName+", web author: "+webAuthor;
    }

}
