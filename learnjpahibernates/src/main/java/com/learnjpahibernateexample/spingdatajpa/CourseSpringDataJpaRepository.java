package com.learnjpahibernateexample.spingdatajpa;

import com.learnjpahibernateexample.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course,Long> {
}
