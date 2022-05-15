package com.bridgelabz.logicalprograms;

public class DayOfWeek {

    public static void main(String[] args) {
        double m = Double.parseDouble(args[0]);// enter month
        double d = Double.parseDouble(args[1]);// enter day
        double y = Double.parseDouble(args[2]);// enter year

        double y0 = y - (14.0 - m) / 12.0;
        double x = y0 + y0 / 4.0 - y0 / 100.0 + y0 / 400.0;
        double m0 = m + 12.0 * ((14.0 - m) / 12.0) - 2;
        double d0 = (d + x + 31.0 * m0 / 12.0) % 7.0;

        System.out.println("day is " + (int) d0);

        switch ((int) d0) {
            case 0 -> System.out.println("Sunday");
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            default -> System.out.println("Invalid day RETRY and enter between 0 -6 !!!");

        }
    }
}