package com.lk.service;

import com.lk.entity.User;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService()
public interface UserService {

   @WebMethod()
    public User userLogin(String name, String password);
    public List<User> selAll();
    public int delUser(int id);
    public User selByid(int id);
    public int updateUser(User user);
    public int insUser(User user1,User user2);
    public int update1(User user);
    public int addUser(User user);

}
