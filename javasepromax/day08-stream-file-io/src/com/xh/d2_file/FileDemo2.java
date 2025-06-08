package com.xh.d2_file;

import java.io.File;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class FileDemo2 {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\MSI_NB\\Pictures\\312.png");

        System.out.println(f.exists());
        System.out.println(f.isFile());
        System.out.println(f.isDirectory());
        System.out.println(f.getName());
        System.out.println(f.length());

        long time = f.lastModified();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss EEE a");
        LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(time), ZoneId.systemDefault());
        String result = dateTime.format(dtf);
        System.out.println(result);

        System.out.println(f.getAbsolutePath());
        System.out.println(f.getPath());
    }
}
