package me.nono.project.study.library.core.domain.entity;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "livro")
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idBook;

    @Column(nullable = false)
    @NotNull
    private String name;

    @Column(nullable = false)
    private String publisher;

    @Column(nullable = false)
    private String language;

    @Column(name = "publication_date",nullable = false)
    private Date publicationDate;

    @Column(nullable = false)
    private int copies;

    @OneToMany(mappedBy = "book")
    private Collection<BookAuthor> bookAuthors;

    @OneToMany(mappedBy = "book")
    private List<BookCategories> categories;

    @ManyToOne
    private Loan loan;


}
