package com.example.fastcamp.controller;

import com.example.fastcamp.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PostController {

    //HTML <form>
    // ajax 검색
    // http post body -> data
    // json, xml, multipart-form, text-plain

    //@RequestMapping(method= RequestMethod.POST, path = "/postMethod")
    @PostMapping(value = "/postMethod")
    public SearchParam postMethod(@RequestBody SearchParam searchParam){

        System.out.println(searchParam);
        return searchParam;
    }
}
