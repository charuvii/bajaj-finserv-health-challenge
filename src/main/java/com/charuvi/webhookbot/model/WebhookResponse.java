package com.charuvi.webhookbot.model;

public class WebhookResponse {
    private String fulfillmentText;

    public WebhookResponse() {}

    public WebhookResponse(String fulfillmentText) {
        this.fulfillmentText = fulfillmentText;
    }

    public String getFulfillmentText() {
        return fulfillmentText;
    }

    public void setFulfillmentText(String fulfillmentText) {
        this.fulfillmentText = fulfillmentText;
    }
}
