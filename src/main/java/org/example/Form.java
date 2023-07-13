package org.example;

import java.io.Serializable;
import java.util.Date;

public class Form implements Serializable {
    private String name;
    private int phone;
    private String university;
    private String specialization;
    private String stage;
    private int course;
    private int hours;
    private Date startDate;
    private Date endDate;

    public Form() {
    }

    public Form(String name, int phone, String university, String specialization, String stage, int course, int hours, Date startDate, Date endDate) {
        this.name = name;
        this.phone = phone;
        this.university = university;
        this.specialization = specialization;
        this.stage = stage;
        this.course = course;
        this.hours = hours;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Form{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                ", university='" + university + '\'' +
                ", specialization='" + specialization + '\'' +
                ", stage='" + stage + '\'' +
                ", course=" + course +
                ", hours=" + hours +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
