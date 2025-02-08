package com.telusko.springdatajparepostory;

import com.telusko.springdatajparepostory.entity.StudentInfo;
import com.telusko.springdatajparepostory.service.ServiceImplementation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringDataJpaRepositoryApplication {

    public static void main(String[] args)
    {
       ApplicationContext container =  SpringApplication.run(SpringDataJpaRepositoryApplication.class, args);
       ServiceImplementation service = container.getBean(ServiceImplementation.class);
       StudentInfo std = service.findStudentInfoBy(2421334);
        System.out.println(std);

        List<Integer> ids = new ArrayList<>();
        ids.add(1223214);
        ids.add(1323423);
        service.findStudentsInfoByIds(ids).forEach((s)-> System.out.println(s));

        String status = service.deleteStudentsInfoByIds(ids);
        System.out.println(status);

        System.out.println(service.deleteStudentsInfoByIdsCrud(ids));

        service.fetchByUniversity("LPU").forEach((s)-> System.out.println(s));
        service.fetchByMajor("CSE").forEach((s)-> System.out.println(s));
        service.fetchByRegIdBetween(13212, 1434324).forEach((s)-> System.out.println(s));
    }

}
