package com.charuvi.webhookbot;

import com.charuvi.webhookbot.service.ApiService;
import com.charuvi.webhookbot.model.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebhookbotApplication implements CommandLineRunner {

    @Autowired
    private ApiService apiService;

    public static void main(String[] args) {
        SpringApplication.run(WebhookbotApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Replace with the actual API URL
        String apiUrl = "https://example.com/api";

        // Call the API and get the response
        ApiResponse apiResponse = apiService.getDataFromRemoteApi(apiUrl);

        // Print the result
        System.out.println("API Response: " + apiResponse.getStatus());
    }
}
