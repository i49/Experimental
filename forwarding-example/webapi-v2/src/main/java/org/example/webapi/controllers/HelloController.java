package org.example.webapi.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Sample REST controller.
 */
@RestController
public class HelloController {

    /**
     * Handles a request by GET method.
     * 
     * @return returned message.
     */
    @RequestMapping(value="/hello", method=RequestMethod.GET)
    public String sayHello() {
        return "Hello v2";
    }

    /**
     * Handles a request by POST method.
     * 
     * @param request the request sent to this servlet container.
     * @param response the response returned by this servlet container.
     */
    @RequestMapping(value="/hello", method=RequestMethod.POST)
    public void requestHello(ServletRequest request, ServletResponse response) {
        ServletContext v2 = request.getServletContext();
        ServletContext v1 = v2.getContext("/webapi/v1");
        RequestDispatcher dispatcher = v1.getRequestDispatcher("/hello");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }
}
