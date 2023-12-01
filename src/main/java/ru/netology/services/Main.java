package ru.netology.services;

public class Main {

    public static void main(String[] args) {
        MonthsRest service = new MonthsRest();
        int numberOfMonths = service.calcMonths(100000, 60000, 150000);
        System.out.println("Месяцы отдыха в году составляют  " + numberOfMonths);
    }

    }
