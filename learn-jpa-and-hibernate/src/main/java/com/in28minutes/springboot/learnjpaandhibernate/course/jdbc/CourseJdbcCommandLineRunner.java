package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
    @Autowired
    private final CourseJdbcRepository courseRepo;

    @Override
    public void run(String... args) throws Exception {
        courseRepo.insert(new Course(1L, "Learn GCP", "in28minutes"));
        courseRepo.insert(new Course(2L, "Learn AWS", "in28minutes"));
        courseRepo.insert(new Course(3L, "Learn DevOps", "in28minutes"));
        courseRepo.insert(new Course(4L, "Learn Angular", "in28minutes"));
        courseRepo.insert(new Course(5L, "Learn React", "in28minutes"));

        courseRepo.deleteById(3L);

        System.out.println(courseRepo.findById(4L));
        System.out.println(courseRepo.findById(5L));
    }
}
