package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table (name = "Task")
@Data
public class Task {
    @Id
    private int id;
    private String Userstory;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserstory() {
        return Userstory;
    }

    public void setUserstory(String userstory) {
        Userstory = userstory;
    }

    public String getAcceptanceCriteria() {
        return AcceptanceCriteria;
    }

    public void setAcceptanceCriteria(String acceptanceCriteria) {
        AcceptanceCriteria = acceptanceCriteria;
    }

    public String getStoryPoint() {
        return StoryPoint;
    }

    public void setStoryPoint(String storyPoint) {
        StoryPoint = storyPoint;
    }

    public int getSprintid() {
        return Sprintid;
    }

    public void setSprintid(int sprintid) {
        Sprintid = sprintid;
    }

    public int getUserid() {
        return Userid;
    }

    public void setUserid(int userid) {
        Userid = userid;
    }

    public String getTaskStatus() {
        return TaskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        TaskStatus = taskStatus;
    }

    public String getAttachmentflag() {
        return Attachmentflag;
    }

    public void setAttachmentflag(String attachmentflag) {
        Attachmentflag = attachmentflag;
    }

    private String AcceptanceCriteria;
    private String StoryPoint;
    private int Sprintid;
    private int Userid;
    private String TaskStatus;
    private String Attachmentflag;

}
