package com.telusko.springdatajparepostory.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class StudentInfo {

    @Id
    private int regId;

    private String name;

    private String university;

    private String major;

    public StudentInfo()
    {
        System.out.println("StudentInfo Constructor");
    }

    public StudentInfo(Integer regId, String name, String university, String major) {
        this.regId = regId;
        this.name = name;
        this.university = university;
        this.major = major;
    }

    public void setRegId(int regId) {
        this.regId = regId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Integer getRegId() {
        return regId;
    }

    public String getName() {
        return name;
    }

    public String getUniversity()
    {
        return university;
    }
    public String getMajor()
    {
        return major;
    }

    public String toString()
    {
        return "Student [ID : " + regId + ", Name : " + name + ", University : " + university + ", Major : " + major + "]";
    }


}
