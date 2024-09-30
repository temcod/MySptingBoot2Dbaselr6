package ru.khramtsov.MySptingBoot2Dbase.dao.acDis;

import org.springframework.stereotype.Repository;
import ru.khramtsov.MySptingBoot2Dbase.entity.acDis.AcademicDisciplines;

import java.util.List;

@Repository
public interface AcademicDisciplinesDAO {

    List<AcademicDisciplines> getAllAcademicDisciplines();

    AcademicDisciplines saveAcademicDisciplines (AcademicDisciplines academicDisciplines);

    AcademicDisciplines getAcademicDisciplines(int id);

    void deleteAcademicDisciplines(int id);



}
