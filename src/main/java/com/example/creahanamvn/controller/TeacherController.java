package com.example.creahanamvn.controller;

import com.example.creahanamvn.model.Teacher;
import com.example.creahanamvn.service.TeacherService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class TeacherController {
    @Autowired
    private ModelMapper mapper;

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/teachers")
    public Page<Teacher> getAllFilters(Pageable pageable) {
        return teacherService.getAllTeachers(pageable);
    }

}
