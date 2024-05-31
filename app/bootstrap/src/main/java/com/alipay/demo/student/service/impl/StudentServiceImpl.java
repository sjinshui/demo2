package com.alipay.demo.student.service.impl;

import com.alipay.demo.student.mapper.StudentMapper;
import com.alipay.demo.student.pojo.Student;
import com.alipay.demo.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public Student GetStudentById(Long id) {
        return studentMapper.GetStudentById(id);
    }
}
