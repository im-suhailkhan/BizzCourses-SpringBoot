package com.Courses.BizzCourses.Controller;

import com.Courses.BizzCourses.Course;
import com.Courses.BizzCourses.Services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    CourseService courseService;

    @GetMapping("/home")
    public String home(){
        return "Home Page";
    }

    @GetMapping("/courses")
    public List<Course> getCourses(){
        return courseService.getCourses();
    }

    @GetMapping("courses/{courseId}")
    public Course getCourse(@PathVariable String Id){
        return this.courseService.getCourse(Long.getLong(Id));
    }
}
