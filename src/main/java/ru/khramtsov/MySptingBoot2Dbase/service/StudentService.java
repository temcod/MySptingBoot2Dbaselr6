package ru.khramtsov.MySptingBoot2Dbase.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ru.khramtsov.MySptingBoot2Dbase.entity.student.Student;

import java.util.List;
@Component
@Service
public interface StudentService {

    List<Student> getAllStudent();

    Student saveStudent(Student student);

    Student getStudent(int id);

    void deleteStudent(int id);

}
