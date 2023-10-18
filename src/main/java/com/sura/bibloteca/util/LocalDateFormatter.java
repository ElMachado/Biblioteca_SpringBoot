package com.sura.bibloteca.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class LocalDateFormatter {
    public LocalDate dateStringToLocalDate(String fecha){
        return LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public String localDatetoDateString(LocalDate fecha){
        return fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
