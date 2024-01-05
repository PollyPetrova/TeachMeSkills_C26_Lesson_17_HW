package com.teachmeskills.lesson17.task1.service;

import com.teachmeskills.lesson17.task1.interfaces.FuncIntrf;

public class StringProcessing {

    public static void doStringProcessing(String string){
        FuncIntrf<String> stringFunc = (str) -> {
            StringBuilder reverse = new StringBuilder();
            for (int i = str.length() - 1; i >= 0; i--) {
                reverse.append(str.charAt(i));
            }
            return reverse.toString();
        };
        System.out.println(stringFunc.func(string));
    }

}
