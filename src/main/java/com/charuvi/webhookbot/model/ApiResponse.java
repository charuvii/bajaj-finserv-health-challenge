package com.charuvi.webhookbot.model;

public class ApiResponse {

    private String status;
    private Data data;

    // Getters and Setters

    public static class Data {
        private String message;

        // Getter and Setter
        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
