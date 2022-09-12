package me.nono.project.study.library.core.domain.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class BookCategoriesPk implements Serializable {

    @Column(name = "fk_livro")
    private long fkBook;

    @Column(name = "fk_categoria")
    private long fkCategory;
}
