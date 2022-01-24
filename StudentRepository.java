package com.company.KIACSchool.Repository;
import com.company.KIACSchool.Entity.Student;
import com.example.daviscollegeapp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>  {
}
