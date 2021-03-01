package org.acme.entity;

import io.quarkus.hibernate.reactive.panache.PanacheEntityBase;

import javax.persistence.*;

@Entity
@Table(name = "table")
public class TableClass extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String name;
}
