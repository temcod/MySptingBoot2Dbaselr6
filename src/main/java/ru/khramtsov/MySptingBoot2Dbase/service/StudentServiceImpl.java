package ru.khramtsov.MySptingBoot2Dbase.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.khramtsov.MySptingBoot2Dbase.dao.student.StudentDAO;
import ru.khramtsov.MySptingBoot2Dbase.entity.student.Student;

import java.util.List;
@Component
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDAO studentDAO;

    @Override
    @Transactional
    public List<Student> getAllStudent() {
        return studentDAO.getAllStudent();
    }
    @Override
    @Transactional
    public Student saveStudent(Student student) {
        return studentDAO.saveStudent(student);
    }
    @Override
    @Transactional
    public Student getStudent(int id) {
         return studentDAO.getStudent(id);
    }

    @Override
    @Transactional
    public void deleteStudent(int id) {
        studentDAO.deleteStudent(id);
    }
}
