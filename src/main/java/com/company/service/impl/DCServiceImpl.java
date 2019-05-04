package com.company.service.impl;

import com.company.service.DCService;
import com.company.service.data.DCDataService;
import com.company.service.data.MarvelDataService;
import com.company.util.JSONUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DCServiceImpl implements DCService {
    @Autowired
    private DCDataService dcDataService;


    @Override
    public String getDCMovieData(String tableName) {

        List<Map<String, Object>> rows = dcDataService.getDCMovieData(tableName);
        return JSONUtils.convertToJson(rows);
    }
}
