package com.example.creahanamvn.service;

import com.example.creahanamvn.model.Teacher;
import com.example.creahanamvn.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService{
    @Autowired
    private TeacherRepository studentRepository;

    @Override
    public Page<Teacher> getAllTeachers(Pageable pageable) {
        return studentRepository.findAll(pageable);
    }
}
