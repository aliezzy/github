package com.example.demo.Dao;

import com.example.demo.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface StudentMapper {
    /**
     * 查询所有学生
     * @return
     */
    public List<Student> findStuAll();
    /**
     * 删除
     * @return
     */
    public int delOne(int sid);

    /**
     * 修改
     * @param sid
     * @return
     */
    public int updateOne(int sid);
}
