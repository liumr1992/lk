package com.lk.service;

import org.springframework.stereotype.Service;

import javax.jws.WebMethod;
import javax.jws.WebService;



@WebService()
public interface TeacherService {
    @WebMethod
    public String selTeacher(int id);
}
