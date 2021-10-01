package com.TheoryOfAlgorithms.Lab_9_DP_ZHA.DP;

/*
 *     Нехай є обмежена кількість обчислювальних ресурсів в
 * центрі обробки даних R і задано кількість фізичних машин [1..P],
 * кожна з яких має власну кількість ресурсів Ri і вартість обслуговування Ci,
 * де 1 <= i <= P. Створено запит на
 * створення V віртуальних машин з ресурсами Rk,
 * де 1 <= k <= V.
 *
 * Розподілити віртуальні машини так, щоб:
 * 1) Було задіяно мінімальну кількість фізичних машин
 * 2) Було задіяно мінімальну кількість ресурсів
 * 3) Мінімізувати витрати
 */

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        List<Machine> machines = new ArrayList<>();

        machines.add(new Machine(1_000_000, 5000));
        machines.add(new Machine(2_500_000, 9000));
        machines.add(new Machine(750_000, 1000));
        machines.add(new Machine(1_890_000, 8000));
        machines.add(new Machine(3_000_000, 11000));

        DataCenter dataCenter = new DataCenter(7, 6_000_000);
        dataCenter.dynamicProg(machines);

        System.out.println("Minimal amount of machines:");
        List<Machine> task1 = dataCenter.getMinimalAmountOfMachines();
        assert task1 != null;
        task1.forEach(System.out::println);

        System.out.println("Minimal amount of resources:");
        List<Machine> task2 = dataCenter.getMinimalAmountOfResources();
        assert task2 != null;
        task2.forEach(System.out::println);

        System.out.println("Minimal price:");
        List<Machine> task3 = dataCenter.getMinimalPriceOf();
        assert task3 != null;
        task3.forEach(System.out::println);

    }

}
