package com.nandolrs.ifrsdev1appv1r1.dados;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity // This tells Hibernate to make a table out of this class
public class Category {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Integer id;

    String name;

    // id

    public Integer getId()
    {
        return this.id;
    }

    public void setId(Integer valor)
    {
        this.id=valor;
    }

    // name

    public String getName()
    {
        return this.name;
    }

    public void setName(String valor)
    {
        this.name=valor;
    }

}
