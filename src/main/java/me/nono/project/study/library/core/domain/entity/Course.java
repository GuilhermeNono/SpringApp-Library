package me.nono.project.study.library.core.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "curso")
public class Course implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long idCourse;

    @Column(nullable = false)
    private String name;

    @Column(name = "course_class", nullable = false)
    private String courseClass;

    @OneToMany(mappedBy = "course")
    private Collection<CoursePerson> coursePeople;

}
