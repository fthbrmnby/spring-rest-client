package main;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String path = "./src/main/resources/user-infos.txt";
        List<String> lines = FileIO.readFile(path);
        List<String> jsonUsers = JsonFactory.toJson(lines);

        for (String user:jsonUsers) {
            try{
                RequestSender.sendingPostRequest(user);
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    }
}
