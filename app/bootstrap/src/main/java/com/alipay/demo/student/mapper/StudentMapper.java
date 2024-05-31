package com.alipay.demo.student.mapper;

import com.alipay.demo.student.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StudentMapper {
    @Select("select * from student where id = #{id}")
    Student GetStudentById(@Param("id") Long id);
}
