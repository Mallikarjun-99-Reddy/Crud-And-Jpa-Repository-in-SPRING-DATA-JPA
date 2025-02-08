package com.telusko.springdatajparepostory.dao;

import com.telusko.springdatajparepostory.entity.StudentInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DatabaseLayerDao extends JpaRepository<StudentInfo, Integer>
{
    public List<StudentInfo> findByUniversity(String university);

    public List<StudentInfo> findByMajor(String major);


    // custom finder
    public List<StudentInfo> findByRegIdBetween(Integer minId, Integer maxId);
}
