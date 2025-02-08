package com.telusko.springdatajparepostory.service;


import com.telusko.springdatajparepostory.dao.DatabaseLayerDao;
import com.telusko.springdatajparepostory.entity.StudentInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImplementation implements ServiceInterface
{
    @Autowired
    private DatabaseLayerDao db;

    @Override
    public StudentInfo findStudentInfoBy(Integer regId) {
        return db.getReferenceById(regId);
    }

    @Override
    public List<StudentInfo> findStudentsInfoByIds(List<Integer> ids) {
        return  db.findAllById(ids);
    }

    @Override
    public String deleteStudentsInfoByIds(List<Integer> ids) {
        if(!ids.isEmpty())
        {
            db.deleteAllByIdInBatch(ids);
            return "Records deleted successfully";
        }
        return "Records Failed to delete";
    }

    @Override
    public String deleteStudentsInfoByIdsCrud(List<Integer> ids)
    {
        List<StudentInfo> list = db.findAllById(ids);
        if(ids.size() == list.size())
        {
            db.deleteAllById(ids);
            return "Records deleted successfully";
        }
        return "Records Failed to delete";
    }

    @Override
    public List<StudentInfo> fetchByUniversity(String university) {
        return db.findByUniversity(university);
    }

    @Override
    public List<StudentInfo> fetchByMajor(String major) {
        return db.findByMajor(major);
    }

    @Override
    public List<StudentInfo> fetchByRegIdBetween(Integer minId, Integer maxId) {
        return db.findByRegIdBetween(minId, maxId);
    }
}
