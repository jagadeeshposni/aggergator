package com.company.service.impl;

import com.company.service.RestAPIService;
import org.springframework.stereotype.Service;

@Service
public class RestAPIServiceImpl implements RestAPIService {
    @Override
    public String getData() {
        return "data from rest api";
    }
}
