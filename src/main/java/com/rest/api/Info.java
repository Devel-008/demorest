package com.rest.api;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
@XmlRootElement
public class Info {
    private long id;
    private String name;
    private String message;
    private Date created;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "Info{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", message='" + message + '\'' +
                ", created=" + created +
                '}';
    }

    public Info(long id, String name, String message) {
        this.id = id;
        this.name = name;
        this.message = message;
        this.created = new Date();
    }
    public Info(){
    }
}
