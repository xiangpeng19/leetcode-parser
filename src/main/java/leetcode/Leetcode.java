package leetcode;

import okhttp3.Response;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class Leetcode {

    HttpClient client;

    private final static String BASE_URL = "https://leetcode.com/api/problems/all/";

//    public Leetcode(HttpClient httpClient) {
//        this.client = httpClient;
//
//    }

    public void getAllProblems() {
//        try {
//            Response r = client.get(BASE_URL);
//            r.body().string()
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }

}
