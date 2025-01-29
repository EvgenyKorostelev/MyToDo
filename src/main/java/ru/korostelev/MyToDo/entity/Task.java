package ru.korostelev.MyToDo.entity;

import java.time.LocalDateTime;
import java.util.UUID;

public class Task {

    public enum Status{
        TO_DO,
        IN_PROGRESS,
        DONE
    }

    private UUID id;
    private String title;
    private String description;
    private Status status;
    private LocalDateTime completionTime;

    public Task(String title, String description) {
        this.id = UUID.randomUUID();
        this.status = Status.TO_DO;
        this.title = title;
        this.description = description;
    }

    public LocalDateTime getCompletionTime() {
        return completionTime;
    }

    public void setCompletionTime(LocalDateTime completionTime) {
        this.completionTime = completionTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
