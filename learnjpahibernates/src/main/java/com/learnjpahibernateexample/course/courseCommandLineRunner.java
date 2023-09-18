package com.learnjpahibernateexample.course;
import com.learnjpahibernateexample.course.Course;
import com.learnjpahibernateexample.course.jpa.CourseJpaRepository;
import com.learnjpahibernateexample.spingdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class courseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository courseJdbcRepository;
//
//    @Autowired
//    private CourseJpaRepository courseJpaRepository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1,"Learn AWS","in28minutes"));
        repository.save(new Course(3,"Learn AWS1","in28minutes"));
        repository.save (new Course(2,"Learn AWS1","in28minutes"));

        repository.deleteById( 1L);
        repository.findAll();

    }
}