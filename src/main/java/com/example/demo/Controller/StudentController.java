package com.example.demo.Controller;

import com.example.demo.Service.StudentService;
import com.example.demo.pojo.Student;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
public class StudentController {
    @Resource
    private StudentService studentService;
    @PostMapping("/findStuAll")
    public List<Student> findStuAll(){
        return studentService.findStuAll();
    }
    @PostMapping("delOne")
    public int delOne(int sid){
        System.out.println("进入后台");
        return studentService.delOne(sid);
    }

}
