package com.company.controller;

import com.company.service.DCService;
import com.company.service.MarvelService;
import com.company.service.RestAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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


    @GetMapping("/marvel/{tableName}")
    public String getMarvelMovies(@PathVariable(value = "") String tableName) {
           return marvelService.getMarvelData(tableName);
    }

    @GetMapping("/dc/{tableName}")
    public String getDcMovies(@PathVariable(value = "") String tableName) {
        return dcService.getDCMovieData(tableName);
    }

    @GetMapping("/restapi")
    public String getDatafromRestApi() {
        return restAPIService.getJsonData();
    }
}
