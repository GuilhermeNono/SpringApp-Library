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
import java.util.Date;

@Entity
@Table(name = "pessoa")
public class Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int rmCpf;

    @Column(nullable = false)
    private String name;

    @Column(name = "joined_date", nullable = false)
    private Date joinedDate;

    @OneToMany(mappedBy = "person")
    private Collection<CoursePerson> coursePeople;


}
