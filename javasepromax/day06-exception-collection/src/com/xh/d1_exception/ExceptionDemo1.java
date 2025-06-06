package com.xh.d1_exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo1 {
    public static void main(String[] args) throws ParseException {

        parseDate("2025-06-05 16:59:00");


    }
    public static void parseDate(String date)throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date d = sdf.parse(date);
        System.out.println(d);
    }
}
