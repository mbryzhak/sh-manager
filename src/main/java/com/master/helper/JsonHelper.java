package com.master.helper;

import com.google.gson.Gson;

public class JsonHelper {

    private String json;

    /**
     *
     * @param json
     * @param type
     * @param <T>
     * @return
     */
    public static <T extends Object> T get(String json, Class<T> type){
        Gson gson = new Gson();
        return gson.fromJson(json, type);
    }
}
