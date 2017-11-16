package com.lk.service;

import com.lk.dao.ClaDao;
import com.lk.entity.Cla;
import com.lk.util.DynamicDataSourceHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClaService {
    @Autowired
    private ClaDao claDao;
    public Cla selCla(int uid){
        System.out.println(uid);
        DynamicDataSourceHolder.putDataSource("dataSource2");
        System.out.println(uid);
        return claDao.selCla(uid);

    }
}
