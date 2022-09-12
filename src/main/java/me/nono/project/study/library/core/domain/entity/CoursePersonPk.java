package me.nono.project.study.library.core.domain.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CoursePersonPk implements Serializable {

    @Column(name = "fk_pessoa")
    private int fkPerson;

    @Column(name = "fk_curso")
    private int fkCourse;

}
