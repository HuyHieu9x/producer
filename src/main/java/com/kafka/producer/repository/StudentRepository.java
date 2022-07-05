package com.kafka.producer.repository;

import com.kafka.producer.modal.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
