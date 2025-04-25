package com.charuvi.webhookbot.service;

import com.charuvi.webhookbot.model.User;
import com.charuvi.webhookbot.model.WebhookResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WebhookService {

    // This method processes the list of users and identifies mutual follows
    public WebhookResponse identifyMutualFollowers(List<User> users) {
        String result = "[";
        for (int i = 0; i < users.size(); i++) {
            for (int j = i + 1; j < users.size(); j++) {
                User user1 = users.get(i);
                User user2 = users.get(j);

                // Check if user1 follows user2 and user2 follows user1 (mutual follow)
                if (user1.getFollows().contains(user2.getId()) && user2.getFollows().contains(user1.getId())) {
                    result += "[" + Math.min(user1.getId(), user2.getId()) + ", " + Math.max(user1.getId(), user2.getId()) + "], ";
                }
            }
        }
        if (result.length() > 1) {
            result = result.substring(0, result.length() - 2); // Remove trailing comma and space
        }
        result += "]";

        // Return the result wrapped in a WebhookResponse object
        return new WebhookResponse(result);
    }
}

