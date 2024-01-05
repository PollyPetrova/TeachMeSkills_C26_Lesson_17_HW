package com.teachmeskills.lesson17.task2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Получить день недели по дате
 */

public class Runner {

    public static void main(String[] args) {

        Date d = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE", Locale.of("en", "BY"));
        String str = dateFormat.format(d);
        System.out.println("Today is "+str);

    }

}
