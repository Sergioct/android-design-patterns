package com.juangabrielgomila.usersettings;

/**
 * Created by JuanGabriel on 6/11/17.
 */

public class User {

    private static User user = new User();

    public static User getSharedInstance(){
        return user;
    }

    private static String building;
    private static String floor;
    private static String desk;
    private static String phone;
    private static String email;

    private static boolean newUser;
    private static String userID;


    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        User.building = building;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        User.floor = floor;
    }

    public String getDesk() {
        return desk;
    }

    public void setDesk(String desk) {
        User.desk = desk;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        User.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        User.email = email;
    }


    public boolean isNewUser() {
        return newUser;
    }

    public void setNewUser(boolean newUser) {
        User.newUser = newUser;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        User.userID = userID;
    }
}
