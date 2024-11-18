package com.company.application.entity;

import com.company.inventorycontrolsystem.entity.Storage;
import io.jmix.core.entity.annotation.ReplaceEntity;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalTime;

@Table(name = "ICS_STORAGE")
@JmixEntity
@Entity
@ReplaceEntity(Storage.class)
public class ExtStorage extends Storage {

    @Column(name = "ACTIVE")
    private Boolean active;

    @Column(name = "WORK_FROM")
    private LocalTime workFrom;

    @Column(name = "WORK_TO")
    private LocalTime workTo;

    public LocalTime getWorkTo() {
        return workTo;
    }

    public void setWorkTo(LocalTime workTo) {
        this.workTo = workTo;
    }

    public LocalTime getWorkFrom() {
        return workFrom;
    }

    public void setWorkFrom(LocalTime workFrom) {
        this.workFrom = workFrom;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}