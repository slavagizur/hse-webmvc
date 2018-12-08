package ru.ibs.education.persistence.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Тестовый класс (в действительности не используется).
 *
 * @author vbotalov
 */
@Entity
public class SampleModel {

    @Id
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
