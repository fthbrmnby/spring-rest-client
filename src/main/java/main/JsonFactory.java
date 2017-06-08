package main;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class JsonFactory {

    public static List<String> toJson(List<String> lines) {
        Gson converter = new Gson();

        List<String> jsonUsers = new ArrayList<String>();

        for (String line : lines) {
            String[] parts = line.split(",");
            String first_name = parts[0];
            String last_name = parts[1];
            int salary = Integer.parseInt(parts[2]);
            User u = new User(first_name,last_name,salary);
            jsonUsers.add(converter.toJson(u));
        }

        return jsonUsers;
    }

}
