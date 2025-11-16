package com.todocli;

import com.todocli.model.Task;
import com.todocli.repository.TaskRepository;
import com.todocli.service.TaskService;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        Task task01 = new Task(
                0,
                LocalDate.of(2024, 6, 15),
                LocalTime.of(14, 30),
                "Finish Java Project",
                "Complete the Java project for the client by the end of the week.",
                false,
                false
        );

        Task task02 = new Task(
                0,
                LocalDate.of(2024, 6, 16),
                LocalTime.of(10, 0),
                "Team Meeting",
                "Attend the weekly team meeting to discuss project updates.",
                false,
                false
        );

        TaskService.home();
    }
}
