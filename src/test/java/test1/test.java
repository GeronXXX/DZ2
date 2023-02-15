package test1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class test {
    @Test
    void shouldOpen() {
        String date = "12.02.2027";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        LocalDate localDate = LocalDate.parse(date, formatter);

        Assertions.assertEquals(11, localDate.getDayOfWeek());

    }
}
