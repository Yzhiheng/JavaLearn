package com.glos.demo;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class getDateDemo {

    public static void main(String[] args) {
        getDateDemo gd = new getDateDemo();
        int YearValue = 2019;
        int MonthValue = 02;
        int week = gd.getWeek(YearValue,MonthValue);
        System.out.println(week);
    }
    public int getWeek(int Year,int Month){
        Calendar calendar = new GregorianCalendar(Year, Month, 1);
        int i = 1;
        int weeked = 0;
        while (calendar.get(Calendar.MONTH) < Month+1) {
            calendar.set(Calendar.WEEK_OF_YEAR, i++);
            calendar.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
            if (calendar.get(Calendar.MONTH) == Month) {
                weeked = weeked+1;
                System.out.printf("星期六：%tF%n", calendar);

            }
        }

        return weeked;
    }
}
