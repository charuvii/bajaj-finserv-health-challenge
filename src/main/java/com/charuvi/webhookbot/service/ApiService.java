package com.charuvi.webhookbot.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.charuvi.webhookbot.model.ApiResponse;

@Service
public class ApiService {

    private final RestTemplate restTemplate;

    public ApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ApiResponse getDataFromRemoteApi(String apiUrl) {
        // Make an API request to the remote API and return the response
        return restTemplate.getForObject(apiUrl, ApiResponse.class);
    }
}
