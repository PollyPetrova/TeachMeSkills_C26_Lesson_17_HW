package com.teachmeskills.lesson17.task1.service;

import com.teachmeskills.lesson17.task1.interfaces.FuncIntrf;

public class IntegerProcessing {

    public static void doIntegerProcessing(int number){
        FuncIntrf<Integer> intFunc=(f) -> {
            int factorial=1;
            for (int i = 1; i <=number ; i++) {
                factorial*=i;
            }
            return factorial;
        };
        System.out.println("Factorial of "+number+" = " +intFunc.func(number));
    }

}
