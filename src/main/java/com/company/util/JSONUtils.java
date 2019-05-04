package com.company.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;
import java.util.Map;

public class JSONUtils {
    public static String convertToJson(List<Map<String, Object>> rows) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gsonObject = gsonBuilder.create();
        return gsonObject.toJson(rows);
    }
}
