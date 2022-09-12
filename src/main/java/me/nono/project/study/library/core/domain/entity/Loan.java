package me.nono.project.study.library.core.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "emprestimo")
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idLoan;

    @Column(name = "loan_date")
    private Date loanDate;

    @Column(name = "renewal_date")
    private Date renewalDate;

    @Column(name = "returned_date")
    private Date returnedDate;

    @OneToMany(mappedBy = "loan")
    private Collection<Book> books;

    @OneToOne
    @JoinColumn(name = "fk_pessoa", referencedColumnName = "rmCpf")
    private Person person;


}
