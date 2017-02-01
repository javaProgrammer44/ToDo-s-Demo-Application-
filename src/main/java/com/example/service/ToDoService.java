package com.example.service;

import antlr.collections.List;

import com.example.model.ToDo;
import com.sun.xml.internal.bind.v2.TODO;

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
