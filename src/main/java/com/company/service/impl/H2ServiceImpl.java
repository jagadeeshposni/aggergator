package com.company.service.impl;

import com.company.service.H2Service;
import org.springframework.stereotype.Service;

@Service
public class H2ServiceImpl implements H2Service {
    @Override
    public String getData() {
        return "Data from H2";
    }
}
