package ru.korostelev.MyToDo.servises;

import org.springframework.stereotype.Service;
import ru.korostelev.MyToDo.entity.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class TaskService {

    private final List<Task> tasks = new ArrayList<>();

    public List<Task> getAllTasks(){
        return tasks;
    }

    public Task getTaskById(UUID uuid){
        return tasks.stream().filter(o -> o.getId().equals(uuid)).findFirst().orElse(null);
    }

    public Task addTask(Task task){
       tasks.add(task);
       return task;
    }

    public  void deleteTaskById(UUID uuid){
        tasks.removeIf(o -> o.getId().equals(uuid));
    }

    public Task updateTaskById(UUID uuid, Task modifiedTask) {
        Task updatedTask = getTaskById(uuid);
        if (updatedTask != null) {
            updatedTask.setDescription(modifiedTask.getDescription());
            updatedTask.setTitle(modifiedTask.getTitle());
            updatedTask.setStatus(modifiedTask.getStatus());
            updatedTask.setCompletionTime(modifiedTask.getCompletionTime());
        }
        return updatedTask;
    }
}
