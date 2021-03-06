package com.example.demo.Service.ServiceImpl;

import com.example.demo.Dao.StudentMapper;
import com.example.demo.Service.StudentService;
import com.example.demo.pojo.Student;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional(rollbackFor = Exception.class)
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;
    @Override
    public List<Student> findStuAll() {
        return studentMapper.findStuAll();
    }

    @Override
    public int delOne(int sid) {
        return studentMapper.delOne(sid);
    }

    @Override
    public int updateOne(int sid) {
        return studentMapper.updateOne(sid);
    }
}
