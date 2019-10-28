package com.example.fastcamp.controller;

import com.example.fastcamp.model.SearchParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GetController {

    @RequestMapping(method= RequestMethod.GET, path="/getMethod")
    public String getRequest(){

        return "Hi getMethod!!";
    }

    @GetMapping("/getMultiParameter") // localhost:8080/api/getMultiParameter?account=abcd&email=study@gmail.com&page=10
    public String getMultiParameter(SearchParam searchParam){
        System.out.println(searchParam.getAccount());
        System.out.println(searchParam.getEmail());
        System.out.println(searchParam.getPage());

        return "OK";
    }
}
