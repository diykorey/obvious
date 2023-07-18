package com.andrunevchyn.obvious;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.TimeZone;

public class DateTimeParserTest {

    public static void main(String[] args) {
        String input = "2023-02-16T02:10:00Z";
        DateTimeFormatter  formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'").withZone(TimeZone.getTimeZone("Europe/Copenhagen").toZoneId());

        ZonedDateTime then = ZonedDateTime.parse(input, formatter );

        System.out.println(then);
    }
}
