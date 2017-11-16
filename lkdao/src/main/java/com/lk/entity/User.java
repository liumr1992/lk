package com.lk.entity;

public class User {

    private int id;
    private  String name;
    private String password;
    private int sex;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public User() {
    }

    public User(int id, String name, String password, int sex) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name='" + name + '\'' + ", password='" + password + '\'' + ", sex=" + sex + '}';
    }
}
