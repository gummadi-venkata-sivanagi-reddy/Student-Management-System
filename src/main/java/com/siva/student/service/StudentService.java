package com.siva.student.service;

import com.siva.student.model.Student;
import com.siva.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    public List<Student> getAll() { return repository.findAll(); }
    public Student save(Student s) { return repository.save(s); }
    public void delete(Long id) { repository.deleteById(id); }
}