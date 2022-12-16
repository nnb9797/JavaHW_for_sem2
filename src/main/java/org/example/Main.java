package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//  1) Дана последовательность N целых чисел. Найти количество положительных чисел,
//  после которых следует отрицательное число.
//                System.out.println("Введите число элементов последовательности, которые необходимо ввести");
//                Scanner in = new Scanner(System.in);
//                int n = in.nextInt();
//                int k = 0; // количество положительных чисел перед отрицательным
//                for (int i = 0; i < n; i++){
//                    Scanner in1 = new Scanner(System.in);
//                    int m = in1.nextInt();
//                    if (m > 0){
//                        k = k+1;
//                    } else {
//                        System.out.println("Количество положительных чисел, после которых следует отрицательное на данном этапе: "+ k);
//                        k = 0;
//                    }
//                }
// 2) Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел,
// после которых следует отрицательное число.
//        int sum = 0; // количество положительных чисел перед отрицательным
//        System.out.println("Введите число элементов последовательности, которые необходимо ввести");
//        while (true) {
//            Scanner in2 = new Scanner(System.in);
//            int m1 = in2.nextInt();
//            if (m1 > 0) {
//                sum = sum + m1;
//            } else {
//                if (m1 == 0) {
//                    break;
//                } else {
//                    if (m1 < 0) {
//                        System.out.println("Сумма положительных чисел, после которых" +
//                                " следует отрицательное на данном этапе: " + sum);
//                        sum = 0;
//                    }
//                }
//            }
//        }
//        System.out.println(sum);
//   3) Дана последовательность N целых чисел. Найти сумму простых чисел.
//                System.out.println("Введите число элементов последовательности, которые необходимо ввести");
//                Scanner in3 = new Scanner(System.in);
//                int n3 = in3.nextInt();
//                int sum3 = 0;
//                int temp = 0;
//                int f = 1; // флаг. число простое
//                for (int i = 0; i < n3; i++){
//                    Scanner in31 = new Scanner(System.in);
//                    int m3 = in31.nextInt();
//                    for (int j = 2; j <= Math.abs(m3/2); j++){
//                        temp = m3 % j;
//                        if (temp == 0){
//                            f = 0;
//                            break;
//                        }
//                    }
//                    if (f == 1){
//                        System.out.println("Число простое");
//                        sum3 = sum3 + m3;
//                    } else {
//                        f = 1;
//                    }
//                }
//                System.out.println("Сумма простых чисел " + sum3);
// 4). Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
//                int ch1 = 0;
//                int ch2 = 0;
//                int f = 1; // последовательность возрастающий
//                System.out.println("Введите число элементов последовательности, которые необходимо ввести");
//                Scanner in4 = new Scanner(System.in);
//                int n4 = in4.nextInt();
//                Scanner in41 = new Scanner(System.in);
//                int m4 = in41.nextInt();
//                ch1 = m4;
//                for (int i = 0; i < n4-1; i++){
//                    Scanner in42 = new Scanner(System.in);
//                    int m42 = in42.nextInt();
//                    ch2 = m42;
//                    if (ch2 < ch1){
//                        System.out.println("Последовательность не является возрастающей");
//                        f = 0;
//                        break;
//                    }
//                    ch1 = ch2;
//                }
//                if (f == 1){
//                    System.out.println("Последовательность является возрастающей");
//                }
// 5) Дан массив целых чисел. Найти сумму элементов, у которых последняя и предпоследняя цифры равны.
//                System.out.println("Введите число элементов, которые необходимо ввести в массив");
//                Scanner in5 = new Scanner(System.in);
//                int n5 = in5.nextInt();
//                int[] massiv = new int[n5];
//                int sum5 = 0;
//                for (int i = 0; i < massiv.length; i++){
//                    System.out.println("Введите очередной элемент массива: ");
//                    Scanner in51 = new Scanner(System.in);
//                    int m5 = in51.nextInt();
//                    massiv[i] = m5;
//                }
//
//                for (int i1 = 0; i1 < massiv.length; i1++){
//                    int length_ch = String.valueOf(massiv[i1]).length();
//                    if (length_ch > 1){
//                        String t_ch = String.valueOf(massiv[i1]);
//                        String c_p_p = t_ch.substring(length_ch-1, length_ch);
//                        String c_p = t_ch.substring(length_ch-2,length_ch-1);
//                        if (c_p_p.equals(c_p)){
//                            sum5 = sum5 + massiv[i1];
//                        }
//                    }
//                }
//                System.out.println("Сумма элементов: " + sum5);
//
//                System.out.println("Массив на экран: ");
//                for (int j = 0 ; j < massiv.length; j++){
//                    System.out.print(massiv[j] + " ");
//                }
// 6).Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
//                System.out.println("Введите число элементов, которые необходимо ввести в массив");
//                Scanner in6 = new Scanner(System.in);
//                int n6 = in6.nextInt(); // счётчик
//                int[] massiv6 = new int[n6];
//                int sum6 = 0;
//                for (int i = 0; i < massiv6.length; i++){
//                    System.out.println("Введите очередной элемент массива: ");
//                    Scanner in61 = new Scanner(System.in);
//                    int m6 = in61.nextInt();
//                    massiv6[i] = m6;
//                }
//
//                for (int i1 =0; i1<massiv6.length; i1++){
//                    if (((massiv6[i1]>9) & (massiv6[i1]<100)) || ((massiv6[i1]>-100) & (massiv6[i1] <-9))){
//                        sum6 = sum6 + i1;
//                    }
//                }
//                for (int i2 = 0; i2< massiv6.length; i2++){
//                    if (massiv6[i2] < 0){
//                        massiv6[i2] = sum6;
//                    }
//                    System.out.println(massiv6[i2] + " ");
//                }

// ООП: 1)Напишите интерфейс Converter для конвертации из градусов по Цельсию в
// Кельвины, Фаренгейты. У классов наследников необходимо переопределить метод интерфейса,
// для валидного перевода величин. Метод для конвертации назовите "convertValue".
//                System.out.println("Введите значение градусов по шкале Цельсия: ");
//                Scanner in_2_3 = new Scanner(System.in);
//                double n_2_3 = in_2_3.nextDouble();
//                Calculator calculator = new Calculator();
//                calculator.convert_value(n_2_3);
//    }
    }
}