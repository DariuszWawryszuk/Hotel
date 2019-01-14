package com.hotels.hotelsmanagement.customer.model;

import javax.persistence.*;

public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "active")
    private Boolean active;

    @PrePersist
    protected void logDataBeforeInsert() {
        this.active = true;
    }
}
