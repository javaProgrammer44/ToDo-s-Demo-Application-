package com.traveliko;

import com.traveliko.model.ToDo;
import com.traveliko.repository.ToDoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    @Autowired
    private ToDoRepository toDoRepository;

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);

        ToDo toDo = new ToDo("Yasir", true);


        ToDoRepository repository = ctx.getBean(ToDoRepository.class);
        repository.save(toDo);

    }
}
