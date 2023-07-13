package org.example;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;

public class GsonParser {
    public static Form parse(){
        Gson gson = new Gson();
        try (FileReader reader = new FileReader("test.json")) {
            return gson.fromJson(reader, Form.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
