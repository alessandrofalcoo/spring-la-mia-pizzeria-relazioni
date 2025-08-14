package org.lessons.java.spring_la_mia_pizzeria_crud.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

@Entity
@Table(name = "pizze")
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "name must not be null, empty or blank ")
    private String name;

    @NotBlank(message = "desc must not be null, empty or blank")
    @Column(name = "description")
    private String desc;

    @NotBlank(message = "url must not be null, empty or blank")
    private String url;

    @NotNull(message = "price must not be null")
    @Positive(message = "price must be greater than zero")
    private int price;

    public Pizza() {
    }

    public Pizza(Integer id, String name, String desc, String url, int price) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.url = url;
        this.price = price;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s, Descrizione: %s, Prezzo: %s", this.name, this.desc, this.price + "€");
    }

}
