package com.Courses.BizzCourses.Services;

import com.Courses.BizzCourses.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseServiceImpl implements CourseService {

    List<Course>al=new ArrayList<>();
    void CourseServiceImpl(){
        al.add(new Course(11,"SEO","This course will cover concepts of SEO"));
        al.add(new Course(21,"SEM","This course will cover concepts of SEM"));
        al.add(new Course(31,"Email Marketing","This course will cover concepts of Email marketing"));
    }
    @Override
    public List<Course> getCourses() {
        return al;
    }
}