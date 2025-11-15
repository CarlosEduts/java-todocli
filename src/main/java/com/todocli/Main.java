package com.todocli;

import com.todocli.config.ConnectionFactory;
import com.todocli.model.Task;
import com.todocli.repository.TaskRepository;
import com.todocli.util.TaskTableCreator;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        TaskTableCreator.create(ConnectionFactory.getConnection());

        Task task01 = new Task(
                0,
                LocalDate.of(2024, 6, 15),
                LocalTime.of(14, 30),
                "Finish Java Project",
                "Complete the Java project for the client by the end of the week.",
                false,
                false
        );
        System.out.println(TaskRepository.create(task01));
    }
}
