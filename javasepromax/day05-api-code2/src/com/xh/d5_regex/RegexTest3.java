package com.xh.d5_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest3 {
    public static void main(String[] args) {

        String data ="来黑马程序员学习Java，\n" +
                "电话：18512516758，18512508907\n"+
                "或者联系邮箱：boniu@itcast.cn\n"+
                "座机电话：01036517895、010-98951256\n"+
                "邮箱：bozai@itcast.cn，\n"+
                "邮箱2：dlei0009@163.com，\n"+
                "热线电话：400-618-9090，400-618-4000，\n"+
                "4006184000，4006189090\n";

        //从中爬取邮箱
        //1.定义正则表达式
        Pattern pattern = Pattern.compile("(\\w{2,30}@\\w{2,20}(\\.\\w{2,20}){1,2})|(1[3-9]\\d{9})" +
                "|(0\\d{2,6}-?[1-9]\\d{3,10})|(400(-?[1-9]\\d{2,6}){1,2})");
        Matcher matcher = pattern.matcher(data);
        while (matcher.find()) {
            System.out.println(matcher.group());

        }
    }
}
