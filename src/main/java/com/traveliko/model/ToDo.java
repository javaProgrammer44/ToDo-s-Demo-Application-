package com.traveliko.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Yasir Shabbir on 2/1/2017.
 */
@Entity
public class ToDo {


    //It's Auto Incremented Valued
    private static Long idValue = 1L;

    @Id
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ToDo toDo = (ToDo) o;

        return id.equals(toDo.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
