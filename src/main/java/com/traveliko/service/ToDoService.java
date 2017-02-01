package com.traveliko.service;

import com.traveliko.model.ToDo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * Created by Yasir Shabbir on 2/1/2017.
 */
@Component
public class ToDoService {

    private static ArrayList<ToDo> toDoList = new ArrayList<ToDo>();

    public void addToDo(ToDo toDo){
        toDoList.add(toDo);
    }
}
