package com.in28minutes.springboot.learnjpaandhibernate.course.jpa;

import com.in28minutes.springboot.learnjpaandhibernate.course.jdbc.Course;
import com.in28minutes.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CourseJpaCommandLineRunner implements CommandLineRunner {
    @Autowired
    private final CourseJpaRepository jpaRepository;
    @Autowired
    private final CourseSpringDataJpaRepository courseRepo;

    @Override
    public void run(String... args) throws Exception {
        jpaRepository.addCourse(new Course(6L, "Learn Python", "in28minutes"));
        jpaRepository.addCourse(new Course(7L, "Learn Kotlin", "in28minutes"));
        courseRepo.save(new Course(8L, "Learn Android", "guru"));
        courseRepo.save(new Course(9L, "Learn Vue.Js", "in28minutes"));
        courseRepo.save(new Course(10L, "Learn Svelte", "guru"));

        courseRepo.deleteById(8L);

        System.out.println(courseRepo.findById(7L));
        System.out.println(courseRepo.findById(9L));
        System.out.println();

        System.out.println(courseRepo.findAll());
        System.out.println(courseRepo.count());
        System.out.println(courseRepo.findByAuthorIgnoreCase("guru"));
        System.out.println(courseRepo.findByNameIgnoreCase("learn KOTLIN"));
    }
}
