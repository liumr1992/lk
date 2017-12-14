package com.lk.entity;




import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
@XmlRootElement(name = "room")
public class Room implements Serializable {

    private int id;
    private String name;

    public Room() {
    }

    public Room(int id, String name) {
        this.id = id;
        this.name = name;
    }

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
}
