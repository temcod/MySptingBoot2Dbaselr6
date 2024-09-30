package ru.khramtsov.MySptingBoot2Dbase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.khramtsov.MySptingBoot2Dbase.entity.acDis.AcademicDisciplines;
import ru.khramtsov.MySptingBoot2Dbase.service.AcademicDisciplinesService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyControllerAcademicDisciplines {

    @Autowired
    private AcademicDisciplinesService academicDisciplinesService;

    // Получить список всех дисциплин
    @GetMapping("/academicDisciplines")
    public List<AcademicDisciplines> allAcademicDisciplines() {
        return academicDisciplinesService.getAllAcademicDisciplines();
    }

    // Получить дисциплину по id
    @GetMapping("/academicDisciplines/{id}")
    public AcademicDisciplines getAcademicDisciplines(@PathVariable("id") int id) {
        return academicDisciplinesService.getAcademicDisciplines(id);
    }

    // Создать новую дисциплину
    @PostMapping("/academicDisciplines")
    public AcademicDisciplines saveAcademicDisciplines(@RequestBody AcademicDisciplines academicDisciplines) {
        return academicDisciplinesService.saveAcademicDisciplines(academicDisciplines);
    }

    // Обновить существующую дисциплину по id
    @PutMapping("/academicDisciplines/{id}")
    public AcademicDisciplines updateAcademicDisciplines(
            @PathVariable("id") int id,
            @RequestBody AcademicDisciplines academicDisciplines) {
        academicDisciplines.setId(id); // Установить id из пути в объект
        return academicDisciplines;
    }

    // Удалить дисциплину по id
    @DeleteMapping("/academicDisciplines/{id}")
    public void deleteAcademicDisciplines(@PathVariable("id") int id) {
        academicDisciplinesService.deleteAcademicDisciplines(id);
    }
}