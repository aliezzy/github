package com.example.demo.Service;

import com.example.demo.pojo.Student;

import java.util.List;

public interface StudentService {
    /**
     * 查询所有学生
     * @return
     */
    public List<Student> findStuAll();
}
