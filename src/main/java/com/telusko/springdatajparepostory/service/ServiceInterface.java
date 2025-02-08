package com.telusko.springdatajparepostory.service;

import com.telusko.springdatajparepostory.entity.StudentInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ServiceInterface
{
    public StudentInfo findStudentInfoBy(Integer regId);
    public List<StudentInfo> findStudentsInfoByIds(List<Integer> ids);

    public String deleteStudentsInfoByIds(List<Integer> ids);
    public String deleteStudentsInfoByIdsCrud(List<Integer> ids);

    // findByKeyword
    public List<StudentInfo> fetchByUniversity(String university);

    public List<StudentInfo> fetchByMajor(String major);


    // custom finder
    public List<StudentInfo> fetchByRegIdBetween(Integer minId, Integer maxId);
}
