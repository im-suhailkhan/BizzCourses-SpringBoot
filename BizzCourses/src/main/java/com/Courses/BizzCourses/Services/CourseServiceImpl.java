package com.Courses.BizzCourses.Services;

import com.Courses.BizzCourses.Course;
import com.Courses.BizzCourses.Dao.CourseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

//    List<Course> al = new ArrayList<>();
    @Autowired
    CourseDao courseDao;
    void CourseServiceImpl() {
//        al.add(new Course(11, "SEO", "This course will cover concepts of SEO"));
//        al.add(new Course(21, "SEM", "This course will cover concepts of SEM"));
//        al.add(new Course(31, "Email Marketing", "This course will cover concepts of Email marketing"));
//
    }

    @Override
    public List<Course> getCourses() {
        return courseDao.findAll();
    }

    @Override
    public Course getCourse(Long Id) {
//        Course c=null;
//        for(Course c1:al){
//            if(c1.getCourseId()==Id)
//                c=c1;
//        }
        return courseDao.getOne(Id);
    }

    @Override
    public Course addCourse(Course course) {
//        al.add(course);
        return courseDao.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
//        for(Course c:al){
//            if(c.getCourseId()==course.getCourseId()){
//                c.setDescription(course.getDescription());
//                c.setTitle(course.getTitle());
//            }
//        }
        return courseDao.save(course);
    }

    @Override
    public void deleteCourse(Long id) {
        Course c=courseDao.getOne(id);
        courseDao.delete(c);
//        for(Course c: al){
//            if(c.getCourseId()==id)
//                al.remove(c);
//        }

    }
}

