package ru.khramtsov.MySptingBoot2Dbase.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.khramtsov.MySptingBoot2Dbase.dao.acDis.AcademicDisciplinesDAO;
import ru.khramtsov.MySptingBoot2Dbase.entity.acDis.AcademicDisciplines;

import java.util.List;
@Service
public class AcademicDisciplinesServiceImpl implements AcademicDisciplinesService{

    @Autowired
    private AcademicDisciplinesDAO academicDisciplinesDAO;

    @Override
    @Transactional
    public List<AcademicDisciplines> getAllAcademicDisciplines() {
        return academicDisciplinesDAO.getAllAcademicDisciplines();
    }

    @Override
    @Transactional
    public AcademicDisciplines saveAcademicDisciplines(AcademicDisciplines academicDisciplines) {
        return academicDisciplinesDAO.saveAcademicDisciplines(academicDisciplines);
    }

    @Override
    @Transactional
    public AcademicDisciplines getAcademicDisciplines(int id) {
        return academicDisciplinesDAO.getAcademicDisciplines(id);
    }

    @Override
    @Transactional
    public void deleteAcademicDisciplines(int id) {
        academicDisciplinesDAO.deleteAcademicDisciplines(id);

    }
}
