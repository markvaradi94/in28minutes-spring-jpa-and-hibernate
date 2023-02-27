package com.in28minutes.springboot.learnjpaandhibernate.course.jpa;

import com.in28minutes.springboot.learnjpaandhibernate.course.jdbc.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
@RequiredArgsConstructor
public class CourseJpaRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public void addCourse(Course course) {
        entityManager.merge(course);
    }

    public void deleteCourse(Long id) {
        Course courseToDelete = findCourse(id);
        entityManager.remove(courseToDelete);
    }

    public Course findCourse(Long id) {
        return entityManager.find(Course.class, id);
    }
}
