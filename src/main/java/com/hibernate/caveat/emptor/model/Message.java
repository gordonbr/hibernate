package com.hibernate.caveat.emptor.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
@Getter
@Setter
public class Message {

    @Id
    @GeneratedValue
    private Long id;

    private String text;

    private transient String composedText;

    @Transient
    private int tax;
}
