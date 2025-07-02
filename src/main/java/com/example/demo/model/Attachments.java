package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

@Entity
@Table (name="Attachments")
@Data
public class Attachments {
    @Id
    private int id;
    private int Taskid;
    private String FileNamePath;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTaskid() {
        return Taskid;
    }

    public void setTaskid(int taskid) {
        Taskid = taskid;
    }

    public String getFileNamePath() {
        return FileNamePath;
    }

    public void setFileNamePath(String fileNamePath) {
        FileNamePath = fileNamePath;
    }
}
