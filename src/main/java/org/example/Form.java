package org.example;

import java.io.Serializable;

public class Form implements Serializable {
    private String name;
    private String phone;
    private String university;
    private String specialization;
    private String stage;
    private int course;
    private int hours;
    private String startDate;
    private String endDate;
    private String petProjects;
    private String ideas;
    private String skills;


    public Form(String name, String phone, String university, String specialization, String stage, int course, int hours, String startDate, String endDate, String petProjects, String ideas, String skills) {
        this.name = name;
        this.phone = phone;
        this.university = university;
        this.specialization = specialization;
        this.stage = stage;
        this.course = course;
        this.hours = hours;
        this.startDate = startDate;
        this.endDate = endDate;
        this.petProjects = petProjects;
        this.ideas = ideas;
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Анкета:" + "\r\n" +
                "Имя: " + getName() + "\r\n" +
                "Телефон: " + getPhone() + "\r\n" +
                "Из учебного заведения: " + getUniversity() + "\r\n" +
                "Со специализацией: " + getSpecialization() + "\r\n" +
                "Со ступенью образования: " + getStage() + "\r\n" +
                "Курс обучения: " + getCourse() + "\r\n" +
                "Готов посветить практике " + getHours() + " часов в день" + "\r\n" +
                "Желает приступить " + getStartDate() +
                " и закончить " + getEndDate() + "\r\n" +
                "Пет проекты: " + getPetProjects() + "\r\n" +
                "Идеи: " + getIdeas() + "\r\n" +
                "Навыки: " + getSkills();
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getUniversity() {
        return university;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getStage() {
        return stage;
    }

    public int getCourse() {
        return course;
    }

    public int getHours() {
        return hours;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getPetProjects() {
        return petProjects;
    }

    public String getIdeas() {
        return ideas;
    }

    public String getSkills() {
        return skills;
    }
}
