package com.ccoacares.potal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jcon520 on 11/25/2015.
 */
@Controller
@RequestMapping("/dataforms")
public class DataFormController {

    @RequestMapping("/bankruptcyform")
    String bankruptcyForm(){

        return "dataforms/index";
    }

}
