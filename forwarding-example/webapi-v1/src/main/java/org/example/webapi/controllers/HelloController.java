package org.example.webapi.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Sample REST controller.
 */
@RestController
public class HelloController {

    @RequestMapping(value="/hello", method= {RequestMethod.GET, RequestMethod.POST})
    public String sayHello() {
        return "Hello v1";
    }
}
