package ru.khramtsov.MySptingBoot2Dbase.dao.student;
import org.springframework.stereotype.Repository;
import ru.khramtsov.MySptingBoot2Dbase.entity.student.Student;

import java.util.List;

@Repository
public interface StudentDAO {

    List<Student> getAllStudent();

    Student saveStudent(Student student);

    Student getStudent(int id);

    void deleteStudent(int id);

}
