package com.example;

import com.example.model.ToDo;
import com.example.repository.ToDoRepository;

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

		ToDo toDo = new ToDo("Yasir",true);


		ToDoRepository repository = ctx.getBean(ToDoRepository.class);
		repository.save(toDo);


		for (ToDo productDetail : repository.findAll()) {
			System.out.println(toDo.getName());
		}

	}
}