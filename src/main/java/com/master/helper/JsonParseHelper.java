package com.master.helper;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class JsonParseHelper {

    private String json;

    public JsonParseHelper(String json){
        this.json = json;

    }

    public JsonElement getValueByKey(String key){
        return new JsonParser().parse(json).getAsJsonObject().get(key);
    }
}
