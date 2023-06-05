package com.juangabriel.singletonpattern;

/**
 * Created by JuanGabriel on 21/9/17.
 */

public class User {

    private String name;
    private String email;
    private String password;


    private static User user = new User();


    private User(){
        name = "Juan Gabriel";
        email = "juangabriel@frogames.es";
        password = "1234";
    }

    public static User getUser() {
        return user;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString(){
        return name + ", "+ email;
    }
}
