package com.company.service.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class DCDataService {

    @Autowired
    @Qualifier("dcdbJdbcTemplate")
    private JdbcTemplate dcTemplate;

    public List<Map<String, Object>> getDCMovieData() {

        List<Map<String, Object>> rows = new ArrayList<Map<String, Object>>();
        String query = " select * from movies";
        try {
            rows = dcTemplate.queryForList(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rows;
    }
}
