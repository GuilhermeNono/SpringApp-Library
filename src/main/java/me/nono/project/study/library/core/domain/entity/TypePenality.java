package me.nono.project.study.library.core.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipopenalidade")
public class TypePenality {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idTypePenality;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "penality_value")
    private Float penalityValue;

}
