package com.e2eTests.automation.utils;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Read from json File
 */
public class DataSet {

    public static JsonObject accessEnvAndLocalSpecificProductData() throws FileNotFoundException {
        JsonParser parser = new JsonParser();
        Object obj = parser.parse(new FileReader("path to json file"));
        return (JsonObject) obj;
    }

    public static String stripQuotes(JsonElement jsonElementWithQuotes){
        return jsonElementWithQuotes.toString().replace("\"", "");
    }
}



