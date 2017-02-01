package com.example.model;

import javax.persistence.Entity;

/**
 * Created by Yasir Shabbir on 2/1/2017.
 */
@Entity
public class ToDo {


    private static Long idValue = 1L;

    @javax.persistence.Id
    private Long id;
    private String name;
    private Boolean isComplete;


    public ToDo() {
        this.id = idValue++;
    }

    public ToDo( String name, Boolean isComplete) {
        this.id = idValue++;
        this.name = name;
        this.isComplete = isComplete;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getComplete() {
        return isComplete;
    }

    public void setComplete(Boolean complete) {
        isComplete = complete;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "ToDo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isComplete=" + isComplete +
                '}';
    }
}
