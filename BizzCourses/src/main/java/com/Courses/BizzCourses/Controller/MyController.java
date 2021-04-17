package com.Courses.BizzCourses.Controller;

import com.Courses.BizzCourses.Course;
import com.Courses.BizzCourses.Services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course){
        return this.courseService.addCourse(course);
    }

    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course){
        return this.courseService.updateCourse(course);
    }

    @DeleteMapping("/courses/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String Id){
        try{
        this.courseService.deleteCourse(Long.getLong(Id));
        return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
