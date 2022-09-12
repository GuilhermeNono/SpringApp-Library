package me.nono.project.study.library.core.domain.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "livrocategoria")
public class BookCategories {

    @EmbeddedId
    private BookCategoriesPk id;

    @ManyToOne
    @MapsId("fkBook")
    @JoinColumn(name = "fk_livro")
    private Book book;

    @ManyToOne
    @MapsId("fkCategory")
    @JoinColumn(name = "fk_categoria")
    private Category category;
}
