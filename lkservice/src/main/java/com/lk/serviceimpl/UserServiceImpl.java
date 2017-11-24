package com.lk.serviceimpl;

import com.lk.dao.UserDao;
import com.lk.entity.User;
import com.lk.service.UserService;
import com.lk.util.DynamicDataSourceHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.jws.WebService;
import java.util.List;

@Service
@WebService(endpointInterface="com.lk.service.UserService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    public User userLogin(String name, String password){
        DynamicDataSourceHolder.putDataSource("dataSource1");

        return userDao.userLogin(name,password);

    }
    public List<User> selAll(){


        return userDao.SelectAll();

    }
    public int delUser(int id){

        DynamicDataSourceHolder.putDataSource("dataSource1");
        return userDao.delUser(id);

    }
    public User selByid(int id){
        DynamicDataSourceHolder.putDataSource("dataSource1");
        return userDao.selByid(id);

    }
    public int updateUser(User user){


        return userDao.updateUser(user);
    }
    @Transactional(readOnly = false,propagation= Propagation.REQUIRED,rollbackFor = Exception.class)
    public int insUser(User user1,User user2){
        DynamicDataSourceHolder.putDataSource("dataSource1");
        int n1=userDao.insUser(user1);
        int n2=userDao.insUser(user2);
        return n1+n2;

    }
    public int update1(User user){

        DynamicDataSourceHolder.putDataSource("dataSource1");

     return userDao.update1(user);
    }
    public int addUser(User user){
        DynamicDataSourceHolder.putDataSource("dataSource1");
        return userDao.insUser(user);

    }


}
