package com.example.springbootbackend.controller;

import com.example.springbootbackend.exception.ResourceNotFoundException;
import com.example.springbootbackend.model.Student;
import com.example.springbootbackend.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/v1/")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    //get all student
//    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/students")
    public List<Student> getAllStudent()
    {
        return studentRepository.findAll();
    }

    //create student rest api
//    @CrossOrigin
    @PostMapping("/students")
    public Student createStudent(@RequestBody Student student)
    {
        return studentRepository.save(student);
    }

    //create getStudent by id rest api
    @GetMapping("/students/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id){
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not exists with this id: " + id));
        return ResponseEntity.ok(student);
    }

    //update student by id rest api
    @PutMapping("/students/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student requestStudentUpdate){
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not exists with this id: " + id));

        student.setFirstName(requestStudentUpdate.getFirstName());
        student.setLastName(requestStudentUpdate.getLastName());
        student.setEmailId(requestStudentUpdate.getEmailId());

        Student updatedStudent = studentRepository.save(student);

        return  ResponseEntity.ok(updatedStudent);
    }
}
