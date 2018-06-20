package com.abhi.quizexam.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.abhi.quizexam.pojo.Courses;

public interface CourseRepo extends JpaRepository<Courses, Integer> {

}
