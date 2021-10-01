package com.TheoryOfAlgorithms.Lab_9_DP_ZHA.BackpackProblem;

import java.util.Arrays;
import java.util.stream.Stream;

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

public class Processor {

    public static void main(String[] args) {

        //массив вещей
        PhysicalMachine[] items = {new PhysicalMachine("Machine-1", 1, 1500),
                new PhysicalMachine("Machine-2", 4, 3000),
                new PhysicalMachine("NextGenMachine", 3, 2000),
                new PhysicalMachine("TheWorst-1", 8, 909),
                new PhysicalMachine("OneMore", 2, 1740),
                new PhysicalMachine("OneMoreOne", 1, 1640),
        };

        int n = items.length; //число строк = число вещей
        int k = 4; //грузоподъёмность рюкзака

        maksPrice(n, k, items);

    }

    static void maksPrice(int n, int k, PhysicalMachine[] items) {

        DataCenter[][] bp = new DataCenter[n + 1][k + 1];

        for (int i = 0; i < n + 1; i++) {

            for (int j = 0; j < k + 1; j++) {

                if (i == 0 || j == 0) { //нулевую строку и столбец заполняем нулями
                    bp[i][j] = new DataCenter(new PhysicalMachine[]{}, 0);

                } else if (i == 1) {

                    /*первая строка заполняется просто: первый предмет кладём или не кладём в зависимости от веса*/
                    bp[1][j] = items[0].getResources() <= j ? new DataCenter(new PhysicalMachine[]{items[0]}, items[0].getPrice())
                            : new DataCenter(new PhysicalMachine[]{}, 0);

                } else {

                    if (items[i - 1].getResources() > j) //если очередной предмет не влезает в рюкзак,
                        bp[i][j] = bp[i - 1][j];    //записываем предыдущий максимум

                    else {
                        /*рассчитаем цену очередного предмета + максимальную цену для (максимально возможный для рюкзака вес − вес предмета)*/
                        int newPrice = items[i - 1].getPrice() + bp[i - 1][j - items[i - 1].getResources()].getPrice();

                        if (bp[i - 1][j].getPrice() > newPrice) //если предыдущий максимум больше
                            bp[i][j] = bp[i - 1][j]; //запишем его

                        else {
                            /*иначе фиксируем новый максимум: текущий предмет + стоимость свободного пространства*/
                            bp[i][j] = new DataCenter(Stream.concat(Arrays.stream(new PhysicalMachine[]{items[i - 1]}),
                                    Arrays.stream(bp[i - 1][j - items[i - 1]
                                            .getResources()]
                                            .getPhysicalMachines()))
                                            .toArray(PhysicalMachine[]::new),
                                    newPrice);
                        }
                    }
                }

            }

        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < k + 1; j++) {
                System.out.print(bp[i][j].getDescription() + " ");
            }
            System.out.print("\n");
        }
    }



}
