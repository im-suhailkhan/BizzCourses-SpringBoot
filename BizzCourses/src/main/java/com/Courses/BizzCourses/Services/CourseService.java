package com.Courses.BizzCourses.Services;

import com.Courses.BizzCourses.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getCourses();
    public Course getCourse(Long Id);
    public Course addCourse(Course course);
    public Course updateCourse(Course course);
    public void deleteCourse(Long id);
}
