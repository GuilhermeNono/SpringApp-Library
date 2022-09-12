package me.nono.project.study.library.core.domain.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "livroautor")
public class BookAuthor implements Serializable {

    @EmbeddedId
    private BookAuthorPk id;

    @ManyToOne
    @MapsId("fkBook")
    @JoinColumn(name = "fk_livro")
    private Book book;

    @ManyToOne
    @MapsId("fkAuthor")
    @JoinColumn(name = "fk_autor")
    private Author author;


}
