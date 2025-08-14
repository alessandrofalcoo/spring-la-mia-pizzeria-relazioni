package org.lessons.java.spring_la_mia_pizzeria_crud.model;

import java.time.LocalDate;

public class SpecialOffer {

    private LocalDate beginDate;
    private LocalDate endDate;
    private String title;

    public SpecialOffer() {
    }

    public SpecialOffer(LocalDate beginDate, LocalDate endDate, String title) {
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.title = title;
    }

    public LocalDate getBeginDate() {
        return this.beginDate;
    }

    public void setBeginDate(LocalDate beginDate) {
        this.beginDate = beginDate;
    }

    public LocalDate getEndDate() {
        return this.endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
