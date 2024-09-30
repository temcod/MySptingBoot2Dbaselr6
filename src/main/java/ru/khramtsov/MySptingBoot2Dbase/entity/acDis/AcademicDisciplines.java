package ru.khramtsov.MySptingBoot2Dbase.entity.acDis;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ACADEMICDISCIPLINES")
public class AcademicDisciplines {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "faculty")
    private String faculty;
}
