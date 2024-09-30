package ru.khramtsov.MySptingBoot2Dbase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import ru.khramtsov.MySptingBoot2Dbase.entity.student.Student;
import ru.khramtsov.MySptingBoot2Dbase.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public ResponseEntity<List<Student>> allStudents(){
        List<Student> allStudents = studentService.getAllStudent();
        if (allStudents.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(allStudents, HttpStatus.OK);
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<?> getStudent(@PathVariable("id") int id) {
        Student student = studentService.getStudent(id);
        if (student == null) {
            return new ResponseEntity<>("Студент не найден", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @PostMapping("/students")
    public ResponseEntity<?> saveStudent(@RequestBody Student student) {
        try {
            Student savedStudent = studentService.saveStudent(student);
            return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Ошибка при сохранении студента", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/students")
    public ResponseEntity<?> updateStudent(@RequestBody Student student) {
        Student existingStudent = studentService.getStudent(student.getId());
        if (existingStudent == null) {
            return new ResponseEntity<>("Студент не найден", HttpStatus.NOT_FOUND);
        }
        try {
            Student updatedStudent = studentService.saveStudent(student);
            return new ResponseEntity<>(updatedStudent, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Ошибка при обновлении студента", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/students/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable("id") int id) {
        Student existingStudent = studentService.getStudent(id);
        if (existingStudent == null) {
            return new ResponseEntity<>("Студент не найден", HttpStatus.NOT_FOUND);
        }
        try {
            studentService.deleteStudent(id);
            return new ResponseEntity<>("Студент успешно удален", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Ошибка при удалении студента", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
