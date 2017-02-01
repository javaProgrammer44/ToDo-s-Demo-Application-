package com.example.repository;

import com.example.model.ToDo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Yasir Shabbir on 2/1/2017.
 */
@Repository
public interface ToDoRepository extends CrudRepository<ToDo,Long> {
}
