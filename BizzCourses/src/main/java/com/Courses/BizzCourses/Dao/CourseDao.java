package com.Courses.BizzCourses.Dao;

import com.Courses.BizzCourses.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course,Long> {
}
