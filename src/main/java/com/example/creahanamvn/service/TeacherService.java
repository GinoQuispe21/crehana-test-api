package com.example.creahanamvn.service;

import com.example.creahanamvn.model.Teacher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TeacherService {
    Page<Teacher> getAllTeachers(Pageable pageable);
}
