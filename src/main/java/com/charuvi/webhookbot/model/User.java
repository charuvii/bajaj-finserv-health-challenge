package com.charuvi.webhookbot.model;

import java.util.List;

public class User {
    private int id;
    private String name;
    private String email;
    private List<Integer> follows;

    // Default constructor
    public User() {}

    // Constructor for only name and email
    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.follows = null;  // Empty list or null if not provided
    }

    // Constructor with all fields
    public User(int id, String name, String email, List<Integer> follows) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.follows = follows;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Integer> getFollows() {
        return follows;
    }

    public void setFollows(List<Integer> follows) {
        this.follows = follows;
    }
}
