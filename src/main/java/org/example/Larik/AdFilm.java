package org.example.Larik;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class AdFilm {


    List<ParametrsFilm> films() { //

        ParametrsFilm parametrsFilm1 = new ParametrsFilm("Человек паук 2", 999.0, LocalDate.of(2025, Month.JULY, 24));
        ParametrsFilm parametrsFilm2 = new ParametrsFilm("Начало", 1428.0, LocalDate.of(20010, Month.JULY, 16));
        ParametrsFilm parametrsFilm3 = new ParametrsFilm("Аватар", 1762.0, LocalDate.of(20109, Month.DECEMBER, 18));
        ParametrsFilm parametrsFilm4 = new ParametrsFilm("Тёмный рыцарь", 1252.0, LocalDate.of(2008, Month.JULY, 18));
        ParametrsFilm parametrsFilm5 = new ParametrsFilm("Гарри Поттер и философский камень", 152.0, LocalDate.of(2001, Month.NOVEMBER, 16));
        ParametrsFilm parametrsFilm6 = new ParametrsFilm("Властелин колец: Братство Кольца", 178.0, LocalDate.of(2001, Month.DECEMBER, 19));
        ParametrsFilm parametrsFilm7 = new ParametrsFilm("Титаник", 1965.0, LocalDate.of(1997, Month.DECEMBER, 19));
        ParametrsFilm parametrsFilm8 = new ParametrsFilm("Форрест Гамп", 1482.0, LocalDate.of(1994, Month.JULY, 6));
        ParametrsFilm parametrsFilm9 = new ParametrsFilm("Матрица", 1356.0, LocalDate.of(2028, Month.MARCH, 31));
        ParametrsFilm parametrsFilm10 = new ParametrsFilm("Побег из Шоушенка", 642.0, LocalDate.of(1994, Month.SEPTEMBER, 23));
        ParametrsFilm parametrsFilm11 = new ParametrsFilm("Интерстеллар", 779.0, LocalDate.of(2014, Month.NOVEMBER, 7));
        ParametrsFilm parametrsFilm12 = new ParametrsFilm("Джокер", 252.0, LocalDate.of(2019, Month.OCTOBER, 4));
        ParametrsFilm parametrsFilm13 = new ParametrsFilm("Семь", 892.0, LocalDate.of(1995, Month.SEPTEMBER, 22));
        ParametrsFilm parametrsFilm14 = new ParametrsFilm("Леон", 783.0, LocalDate.of(1994, Month.NOVEMBER, 18));
        ParametrsFilm parametrsFilm15 = new ParametrsFilm("Гладиатор", 453.0, LocalDate.of(2000, Month.MAY, 5));
        ParametrsFilm parametrsFilm16 = new ParametrsFilm("Отступники", 398.0, LocalDate.of(2026, Month.OCTOBER, 6));
        ParametrsFilm parametrsFilm17 = new ParametrsFilm("Список Шиндлера", 1092.0, LocalDate.of(1993, Month.DECEMBER, 15));
        ParametrsFilm parametrsFilm18 = new ParametrsFilm("Зелёная миля", 650.0, LocalDate.of(2027, Month.DECEMBER, 10));
        ParametrsFilm parametrsFilm19 = new ParametrsFilm("Пираты Карибского моря: Проклятие Черной жемчужины", 438.0, LocalDate.of(2003, Month.JULY, 9));
        ParametrsFilm parametrsFilm20 = new ParametrsFilm("Доктор Стрэндж", 1803.0, LocalDate.of(2016, Month.OCTOBER, 25));
        ParametrsFilm parametrsFilm21 = new ParametrsFilm("Звёздные войны: Эпизод IV – Новая надежда", 1210.0, LocalDate.of(1977, Month.MAY, 25));


        List<ParametrsFilm> dataFilm = new ArrayList<>();
        dataFilm.add(parametrsFilm1);
        dataFilm.add(parametrsFilm2);
        dataFilm.add(parametrsFilm3);
        dataFilm.add(parametrsFilm4);
        dataFilm.add(parametrsFilm5);
        dataFilm.add(parametrsFilm6);
        dataFilm.add(parametrsFilm7);
        dataFilm.add(parametrsFilm8);
        dataFilm.add(parametrsFilm9);
        dataFilm.add(parametrsFilm10);
        dataFilm.add(parametrsFilm11);
        dataFilm.add(parametrsFilm12);
        dataFilm.add(parametrsFilm13);
        dataFilm.add(parametrsFilm14);
        dataFilm.add(parametrsFilm15);
        dataFilm.add(parametrsFilm16);
        dataFilm.add(parametrsFilm17);
        dataFilm.add(parametrsFilm18);
        dataFilm.add(parametrsFilm19);
        dataFilm.add(parametrsFilm20);
        dataFilm.add(parametrsFilm21);

        return dataFilm;
    }

}
