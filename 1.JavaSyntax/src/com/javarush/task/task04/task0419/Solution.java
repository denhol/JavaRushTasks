package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());
        int num4 = Integer.parseInt(reader.readLine());

        int max1;
        int max2;

        if (num1 >= num2) {
            max1 = num1;
        } else {
            max1 = num2;
        }

        if (num3 >= num4) {
            max2 = num3;
        } else {
            max2 = num4;
        }

        if (max1 >= max2) {
            System.out.println(max1);
        } else {
            System.out.println(max2);
        }
    }
}
