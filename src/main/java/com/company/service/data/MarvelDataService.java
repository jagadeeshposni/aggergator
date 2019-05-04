package com.company.service.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class MarvelDataService {

    @Autowired
    @Qualifier("marveldbJdbcTemplate")
    private JdbcTemplate marvelTemplate;

    public List<Map<String, Object>> getMarvelMovieData() {
        List<Map<String, Object>> rows = new ArrayList<Map<String, Object>>();
        String query = " select * from movies";
        try {
            rows = marvelTemplate.queryForList(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rows;
    }
}
