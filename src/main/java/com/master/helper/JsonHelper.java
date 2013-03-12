package com.master.helper;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import org.apache.log4j.Logger;

public class JsonHelper {

    private static final Logger LOGGER = Logger.getLogger(JsonHelper.class);

    /**
     * This method deserializes the specified Json into an object of the specified class
     * @param json the string from which the object is to be deserialized
     * @param type the class of T
     * @param <T> the type of the desired object
     * @return <code>null<code/> if json string is invalid; an object of type T from the string
     */
    public static <T extends Object> T get(String json, Class<T> type){
        Gson gson = new Gson();
        try{
            return gson.fromJson(json, type);
        } catch (JsonSyntaxException e) {
            LOGGER.error(String.format("Error parsing json string: %s", json));
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
