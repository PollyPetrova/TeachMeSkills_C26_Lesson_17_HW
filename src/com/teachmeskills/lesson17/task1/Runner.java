package com.teachmeskills.lesson17.task1;
import com.teachmeskills.lesson17.task1.service.IntegerProcessing;
import com.teachmeskills.lesson17.task1.service.StringProcessing;

import java.util.Scanner;

/**
 * Задача 1
 * Создать обобщенный функциональный интерфейс.
 * Написать класс с одним методом.
 * В этом методе реализуйте логику:
 * 	- если в консоль введена цифра 1, то: использования интерфейса со строковым типом и передать
 *                                       в метод интерфейса логику реверса строки(вывода строки в обратном порядке).
 *	- если в консоль введена цифра 2, то: использования интерфейса с целочисленным типом и
 *                                       передать в метод интерфейса логику нахождения факториала числа.
 */

public class Runner {

    public static void main(String[] args) {

        System.out.println("Enter number 1 or 2!");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        scanner.nextLine();

        switch (n){
            case 1:
                System.out.println("Enter string to reverse!");
                String string=scanner.nextLine();
                StringProcessing.doStringProcessing(string);
                break;
            case 2:
                System.out.println("Enter number to count factorial!");
                int number=scanner.nextInt();
                IntegerProcessing.doIntegerProcessing(number);
                break;
            default:
                System.out.println("Wrong number! Enter 1 or 2 number!");
        }



    }

}
