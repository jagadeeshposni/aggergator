package com.company.service.impl;

import com.company.service.MarvelService;
import com.company.service.data.MarvelDataService;
import com.company.util.JSONUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MarvelServiceImpl implements MarvelService {


    @Autowired
    private MarvelDataService marvelDataService;


    @Override
    public String getMarvelData(String tableName) {
        List<Map<String, Object>> rows = marvelDataService.getMarvelMovieData(tableName);
        return JSONUtils.convertToJson(rows);

    }
}
