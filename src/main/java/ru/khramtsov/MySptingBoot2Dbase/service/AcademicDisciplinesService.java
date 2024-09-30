package ru.khramtsov.MySptingBoot2Dbase.service;

import org.springframework.stereotype.Service;
import ru.khramtsov.MySptingBoot2Dbase.entity.acDis.AcademicDisciplines;

import java.util.List;
@Service
public interface AcademicDisciplinesService {

    List<AcademicDisciplines> getAllAcademicDisciplines();

    AcademicDisciplines saveAcademicDisciplines(AcademicDisciplines academicDisciplines);

    AcademicDisciplines getAcademicDisciplines(int id);

    void deleteAcademicDisciplines(int id);
}
