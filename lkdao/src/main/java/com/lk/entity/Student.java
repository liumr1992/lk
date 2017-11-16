package com.lk.entity;

public class Student {

    private int id;
    private String name;
    private int sex;
    private  String cname;
    private int score;

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

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student() {
    }

    public Student(int id, String name, int sex, String cname, int score) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.cname = cname;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name='" + name + '\'' + ", sex=" + sex + ", cname='" + cname + '\'' + ", score=" + score + '}';
    }
}
