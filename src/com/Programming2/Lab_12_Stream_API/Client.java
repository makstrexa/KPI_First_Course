package com.Programming2.Lab_12_Stream_API;

/*
 * Вивести на екран списки прізвищ і балів, відсортовані за абеткою:
 * 1.1. Абітурієнтів, які поступили на «бюджет»
 *     (N студентів з найвищими балами, де N – кількість місць на «бюджет», кількість балів > 60)
 */

import java.util.*;

public class Client {

    public static void main(String[] args) {

        List<Graduate> graduates = Arrays.asList(new Graduate("Ivanov", 50),
                                                 new Graduate("Baranov", 90),
                                                 new Graduate("Stepanov", 78),
                                                 new Graduate("Bikov", 99),
                                                 new Graduate("Shevchenko", 67));

        int limit = 3;

        System.out.println("\n-- Task 1.1 --");
        graduates
                .stream()
                .filter(graduate -> graduate.getPoints() > 60)
                .sorted(Comparator.comparing(Graduate::getPoints).reversed())
                .limit(limit)
                .sorted(Comparator.comparing(Graduate::getSurname))
                .forEach(System.out::println);

        System.out.println("\n-- Task 3.1 --");
        graduates
                .stream()
                .filter(graduate -> graduate.getPoints() < 60)
                .forEach(System.out::println);
    }

}
