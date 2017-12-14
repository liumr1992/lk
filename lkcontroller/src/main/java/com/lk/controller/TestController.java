package com.lk.controller;

import com.lk.entity.Room;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping(value = "/getRoom/{name}", method = RequestMethod.GET)
    public @ResponseBody
    Room getRoom(@PathVariable String name) {


   Room room=new Room(1,name);
   return room;
    }



}
