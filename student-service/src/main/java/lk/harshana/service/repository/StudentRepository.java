package lk.harshana.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lk.harshana.service.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
