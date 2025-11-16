package com.todocli.service;

import com.todocli.model.Task;
import com.todocli.repository.TaskRepository;
import com.todocli.view.Components;
import com.todocli.view.Menu;
import com.todocli.view.enums.Colors;
import com.todocli.view.enums.HomeOption;
import com.todocli.view.enums.TaskOption;

import java.util.List;

public class TaskService {
    public static void home() {
        HomeOption homeOption = Menu.home();

        switch (homeOption) {
            case LIST -> listAll();
            case CREATE -> {
            }
            case SEARCH -> {
            }
            case DELETED_LIST -> {
            }
            case QUIT -> {
                return;
            }
        }
    }

    public static void listAll() {
        List<Task> tasks = TaskRepository.findAll();
        tasks = tasks.stream().filter(task -> !task.isDeleted()).toList();
        Task selectedTask = Menu.listTasks(tasks);

        while (true) {
            TaskOption taskOption = Menu.taskDetails(selectedTask);

            switch (taskOption) {
                case MARK_DONE -> {
                    if (Menu.confirmTaskComplete(selectedTask)) {
                        TaskRepository.markAsComplete(selectedTask);
                        Components.info(Colors.SUCCESS, "Tarefa marcada como concluída.");
                    } else {
                        Components.info(Colors.WARNING, "Ação cancelada.");
                    }
                }
                case DELETE -> {
                    if (Menu.confirmTaskDelete(selectedTask)) {
                        TaskRepository.delete(selectedTask);
                        Components.info(Colors.SUCCESS, "Tarefa deletada com sucesso.");
                    } else {
                        Components.info(Colors.WARNING, "Ação cancelada.");
                    }
                }
                case BACK -> {
                    home();
                    return;
                }
            }
        }
    }
}
