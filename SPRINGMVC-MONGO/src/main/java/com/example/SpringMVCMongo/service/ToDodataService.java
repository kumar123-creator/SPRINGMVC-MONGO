package com.example.SpringMVCMongo.service;

import com.example.SpringMVCMongo.entity.ToDodata;


public interface ToDodataService {

    Iterable<ToDodata> getAllToDos();

    ToDodata saveToDo(ToDodata toDodata);

    void deleteToDoById(int id);

  
    // New method for adding a student
    ToDodata addToDo(ToDodata toDodata);

    ToDodata updateToDo(ToDodata updatedToDo);
}