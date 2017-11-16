package com.lk.entity;

public class Cla {

    private int id;
    private String cname;
    private int score;
    private int uid;

    public Cla() {
    }

    public Cla(int id, String cname, int score, int uid) {
        this.id = id;
        this.cname = cname;
        this.score = score;
        this.uid = uid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "Cla{" + "id=" + id + ", cname='" + cname + '\'' + ", score=" + score + ", uid=" + uid + '}';
    }
}
