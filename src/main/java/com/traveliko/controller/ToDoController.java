package com.traveliko.controller;

import com.traveliko.model.ToDo;
import com.traveliko.repository.ToDoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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


    /*
    This Request Handler used for Add "TODO" Object inside the repository
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ToDo greetings(@RequestBody ToDo toDo) {
        toDoRepository.save(toDo);
        return toDo;
    }


    /*
    This Request Handler used for retrieve all TODO Object from the repository
     */
    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public Iterable findAll() {
        return toDoRepository.findAll();
    }


    /*
    This Request Handler used for retrieve Single TODO Object from the repository
     */
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public ToDo findToDo(@PathVariable("id") Long id) {
        ToDo todo = toDoRepository.findOne(id);
        return todo;
    }


    /*
This Request Handler used for Delete Single TODO Object from the repository
 */
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public void deleteToDo(@PathVariable("id") Long id) {
        toDoRepository.delete(id);
    }

}
