package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<Integer> list1 = new ArrayList<>();   //создание списка
        Collections.addAll(list1, 1, 5, 6, 11, 3, 15, 7, 8);   //заполнение списка

        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 1, 8, 6, 21, 53, 5, 57, 436546);

        ArrayList<Integer> result = new ArrayList<>();

        result.addAll(list1);   //добавление всех значений из одного списка в другой
        result.addAll(list2);

        for (Integer x : result)   //быстрый for по всем элементам, только для коллекций
        {
            System.out.println(x);
        }
    }
}
