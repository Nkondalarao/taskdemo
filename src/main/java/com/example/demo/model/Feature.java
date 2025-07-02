package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table (name="Feature")
@Data
public class Feature {
    @Id
    private int id;
    private String Discripation;
    private int Projectid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDiscripation() {
        return Discripation;
    }

    public void setDiscripation(String discripation) {
        Discripation = discripation;
    }

    public int getProjectid() {
        return Projectid;
    }

    public void setProjectid(int projectid) {
        Projectid = projectid;
    }
}
