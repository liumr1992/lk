package com.lk.serviceimpl;

import com.lk.dao.TeacherDao;
import com.lk.service.TeacherService;
import com.lk.util.DynamicDataSourceHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

@Service
@WebService(endpointInterface ="com.lk.service.TeacherService")
public class
TeacherServiceImpl implements TeacherService  {
   @Autowired
   private TeacherDao teacherDao;
    public String selTeacher(int id) {
        DynamicDataSourceHolder.putDataSource("dataSource1");
        return teacherDao.selTeacher(id);
    }
}
