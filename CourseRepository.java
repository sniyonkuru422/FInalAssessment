package com.company.KIACSchool.Repository;
import com.company.KIACSchool.Entity.Course;
import com.example.daviscollegeapp.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CourseRepository extends JpaRepository<Course, Integer>{
}