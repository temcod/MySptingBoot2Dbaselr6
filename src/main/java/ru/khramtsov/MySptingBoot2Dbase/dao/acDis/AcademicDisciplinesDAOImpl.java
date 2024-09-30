package ru.khramtsov.MySptingBoot2Dbase.dao.acDis;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.khramtsov.MySptingBoot2Dbase.entity.acDis.AcademicDisciplines;

import java.util.List;
@Slf4j
@Repository
public class AcademicDisciplinesDAOImpl implements AcademicDisciplinesDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<AcademicDisciplines> getAllAcademicDisciplines() {
        Query query = entityManager.createQuery("from AcademicDisciplines");
        List<AcademicDisciplines> allAcademicDisciplines = query.getResultList();
        log.info("getAllAcademicDisciplines" + allAcademicDisciplines);
        return allAcademicDisciplines;
    }

    @Override
    public AcademicDisciplines saveAcademicDisciplines(AcademicDisciplines academicDisciplines) {
        return entityManager.merge(academicDisciplines);
    }

    @Override
    public AcademicDisciplines getAcademicDisciplines(int id) {
        return entityManager.find(AcademicDisciplines.class,id);
    }

    @Override
    public void deleteAcademicDisciplines(int id) {
        Query query = entityManager.createQuery("delete from AcademicDisciplines"
        + " where id =:academicDisciplinesId");
        query.setParameter("academicDisciplinesId", id);
        query.executeUpdate();

    }
}
