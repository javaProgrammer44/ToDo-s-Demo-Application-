package com.example.controller;

import com.example.model.ToDo;
import com.example.repository.ToDoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Yasir Shabbir on 2/1/2017.
 */

@RestController
@RequestMapping("/todo")
public class ToDoController {

    private final ToDoRepository toDoRepository;

    @Autowired
    public ToDoController(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ToDo greetings(@PathVariable("id") Long id) {
        ToDo todo = new ToDo();
        todo.setName("Yasir Shabbir");
        todo.setComplete(true);

        toDoRepository.save(todo);
        return todo;
    }


    @RequestMapping(value = "/add", method = RequestMethod.POST ,consumes =MediaType.APPLICATION_JSON_VALUE, produces= MediaType.APPLICATION_JSON_VALUE)
    public ToDo greetings(@RequestBody ToDo toDo) {
        toDoRepository.save(toDo);
        return toDo;
    }


    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public Iterable findAll() {
        return toDoRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST , consumes =MediaType.APPLICATION_JSON_VALUE, produces= MediaType.APPLICATION_JSON_VALUE)
    public ToDo create(@RequestBody ToDo todo) {
        return toDoRepository.save(todo);
    }
}
