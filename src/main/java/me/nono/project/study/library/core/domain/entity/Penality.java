package me.nono.project.study.library.core.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "penalidade")
public class Penality {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idPenality;

    @Column(name = "penality_date")
    private Date penalityDate;

    @OneToOne
    @JoinColumn(name = "fk_pessoa", referencedColumnName = "rmCpf")
    private Person person;

    @OneToOne
    @JoinColumn(name = "fk_emprestimo", referencedColumnName = "idLoan")
    private Loan loan;

    @OneToOne
    @JoinColumn(name = "fk_tipopenalidade", referencedColumnName = "idTypePenality")
    private TypePenality typePenality;

}
