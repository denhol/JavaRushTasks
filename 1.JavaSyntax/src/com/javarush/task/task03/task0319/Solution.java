package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int dig1 = Integer.parseInt((reader.readLine()));
        int dig2 = Integer.parseInt(reader.readLine());
        System.out.println(name + " получает " + dig1 + " через " + dig2 + " лет.");
    }
}
