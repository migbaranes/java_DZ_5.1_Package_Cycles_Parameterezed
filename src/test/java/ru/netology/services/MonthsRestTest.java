package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class MonthsRestTest {

    @ParameterizedTest

    @CsvFileSource(files = "src/test/resources/NumberMonths.csv")
    public void testCorrespondsNumberMonths(int expected, int income, int expenses, int threshold) {

        MonthsRest service = new MonthsRest();
//        int expected = 2;
        int actual = service.calcMonths(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }


//    @Test
//
//    public void testCorrespondsNumberMonthsSmallIncome(){
//        MonthsRest service = new MonthsRest();
//        int expected = 3;
//        int actual = service.calcMonths(10000, 3000, 20000);
//
//        Assertions.assertEquals(expected, actual);
//
//    }
}
