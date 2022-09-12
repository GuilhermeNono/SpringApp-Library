package me.nono.project.study.library.core.domain.entity;

import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@Table(name = "cursopessoa")
public class CoursePerson implements Serializable {

    @EmbeddedId
    private CoursePersonPk id;

    @ManyToOne
    @MapsId("fkPerson")
    @JoinColumn(name = "fk_pessoa")
    private Person person;

    @ManyToOne
    @MapsId("fkCourse")
    @JoinColumn(name = "fk_curso")
    private Course course;

}
