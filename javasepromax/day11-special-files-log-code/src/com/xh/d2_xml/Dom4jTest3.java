package com.xh.d2_xml;

import java.io.*;

public class Dom4jTest3 {
    public static void main(String[] args) throws IOException {


        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n");
        sb.append("<user>\r\n");
        sb.append("\t<name>张三</name>\r\n");
        sb.append("\t<age>30</age>\r\n");
        sb.append("</user>\r\n");

        PrintWriter printWriter = new PrintWriter("day11-special-files-log-code\\src\\com\\xh\\d2_xml\\demo2-user.xml");
        printWriter.write(sb.toString());
        printWriter.close();
    }
}
