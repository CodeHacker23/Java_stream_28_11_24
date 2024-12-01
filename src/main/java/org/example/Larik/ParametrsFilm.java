package org.example.Larik;

import java.time.LocalDate;

public class ParametrsFilm {
  private String name;
  private  double prise;
  private LocalDate localDate;

  public ParametrsFilm(String name, double prise, LocalDate localDate) {
        this.name = name;
        this.prise = prise;
        this.localDate = localDate;
    }

    public ParametrsFilm() {

    }

    public String getName() {
        return name;
    }

    public double getPrise() {
        return prise;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    @Override
    public String toString() {
        return "" +
                "Название фильма: " + name +
                ", Цена за билет:  " + prise +
                ", Дата выхода фильма " + localDate;
    }


}


