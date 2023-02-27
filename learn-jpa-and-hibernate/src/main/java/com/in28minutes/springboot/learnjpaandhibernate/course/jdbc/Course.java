package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.IDENTITY;

@Data
@Builder
@Entity(name = "Course")
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    @Id
    private Long id;

    //    @Column(name = "name")
    private String name;
    //    @Column(name = "author")
    private String author;
}
