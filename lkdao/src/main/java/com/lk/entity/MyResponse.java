package com.lk.entity;

public class MyResponse {

    private Object object;
    private int status;

    public MyResponse() {
    }

    public MyResponse(Object object, int status) {
        this.object = object;
        this.status = status;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
