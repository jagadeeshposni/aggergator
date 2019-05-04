package com.company.service.impl;

import com.company.service.MySqlService;
import org.springframework.stereotype.Service;

@Service
public class MySqlServiceImpl implements MySqlService {
    @Override
    public String getData() {
        return "data from mysql";
    }
}
