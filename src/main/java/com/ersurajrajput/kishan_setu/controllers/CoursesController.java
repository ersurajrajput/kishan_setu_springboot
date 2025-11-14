package com.ersurajrajput.kishan_setu.controllers;

import com.ersurajrajput.kishan_setu.models.CoursesModel;
import com.ersurajrajput.kishan_setu.repository.CoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CoursesController {

    @Autowired
    private CoursesRepository coursesRepository;

    // Fetch courses with pagination
    @GetMapping()
    public Page<CoursesModel> getCoursesByPage(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size
    ) {
        Pageable pageable = PageRequest.of(page, size, Sort.by("title").ascending());
        return coursesRepository.findAll(pageable);
    }

    // Fetch all courses without pagination
    @GetMapping("/all")
    public List<CoursesModel> getAllCourses() {
        return coursesRepository.findAll();
    }
}
