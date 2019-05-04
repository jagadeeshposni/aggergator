package com.company.controller;

import com.company.service.H2Service;
import com.company.service.MySqlService;
import com.company.service.RestAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AggregatorRestController {

    private H2Service h2Service;
    private MySqlService mySqlService;
    private RestAPIService restAPIService;

    @Autowired
    public AggregatorRestController(H2Service h2Service, MySqlService mySqlService, RestAPIService restAPIService) {
        this.h2Service = h2Service;
        this.mySqlService = mySqlService;
        this.restAPIService = restAPIService;
    }

    @GetMapping("/")
    public String sayHello() {
        return "yo";
    }

    @GetMapping("/h2")
    public String getDataFromH2() {
        return h2Service.getData();
    }

    @GetMapping("/mysql")
    public String getDataFromMySql() {
        return mySqlService.getData();
    }

    @GetMapping("/restapi")
    public String getDatafromRestApi() {
        return restAPIService.getData();
    }
}
