package com.company.controller;

import com.company.service.DCService;
import com.company.service.MarvelService;
import com.company.service.RestAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class AggregatorRestController {

    private MarvelService marvelService;
    private DCService dcService;
    private RestAPIService restAPIService;

    @Autowired
    public AggregatorRestController(MarvelService marvelService, DCService dcService, RestAPIService restAPIService) {
        this.marvelService = marvelService;
        this.dcService = dcService;
        this.restAPIService = restAPIService;
    }

    @Autowired
    @Qualifier("dcdbJdbcTemplate")
    private JdbcTemplate dcTemplate;


    @GetMapping("/marvel-movies")
    public String getMarvelMovies() {
           return marvelService.getMarvelMovieData();
    }

    @GetMapping("/dc-movies")
    public String getDcMovies() {
        return null;
    }

    @GetMapping("/restapi")
    public String getDatafromRestApi() {
        return restAPIService.getData();
    }
}
