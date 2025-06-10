package com.xh.d7_commons_io;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;

public class CommonsIOTest {
    public static void main(String[] args) throws IOException {
        Long start = System.currentTimeMillis();
        FileUtils.copyFile(new File("day10-io-code2\\src\\com\\xh\\d7_commons_io\\aa.txt"),new File("day10-io-code2\\src\\com\\xh\\d7_commons_io\\bb.txt"));
//        FileUtils.copyDirectory(new File("day10-io-code2\\src\\com\\xh\\d7_commons_io\\aa"),new File("day10-io-code2\\src\\com\\xh\\d7_commons_io\\bb"));
//        FileUtils.deleteDirectory(new File("day10-io-code2\\src\\com\\xh\\d7_commons_io\\bb"));

        //JDK7新增单行复制
        Files.copy(Path.of("day10-io-code2\\src\\com\\xh\\d7_commons_io\\aa.txt"),Path.of("day10-io-code2\\src\\com\\xh\\d7_commons_io\\bb.txt"));

        Long end = System.currentTimeMillis();
        System.out.println("用时："+(end - start)/1000.0+"s");
    }
}
