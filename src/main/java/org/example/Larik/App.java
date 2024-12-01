package org.example.Larik;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App{
    public static void main(String[] args) {
       AdFilm adFilm = new AdFilm();

        adFilm.films().stream() //Отфильтровать фильмы, уже выпущенные  (использовать filter). и вывести
               .filter(film -> film.getLocalDate().isBefore(LocalDate.now()))
               .forEach(System.out::println);

       adFilm.films().stream() // отфильтровать фильмы, еще не  выпущенные  (использовать filter). и вывести
               .filter(film -> film.getLocalDate().isAfter(LocalDate.now()))
               .forEach(System.out::println);

        adFilm.films().stream()
                .filter(film -> film.getLocalDate().isAfter(LocalDate.now()))
                .filter(film -> film.getPrise() > 1000.0)
                .collect(Collectors.toCollection(HashSet::new))
                .forEach(System.out::println);


    }






}
