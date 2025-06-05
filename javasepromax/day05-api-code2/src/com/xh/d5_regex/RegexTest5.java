package com.xh.d5_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest5 {
    public static void main(String[] args) {
        String data="欢迎张全蛋光临本系统!他删率并跑路欢迎李二狗子光临本系统!"+
        "欢迎马六子光临本系统!它浏览了很多好看的照片!欢迎夏洛光临本系统!他在六点钟送出了一个嘉年华!";

        Pattern pattern = Pattern.compile("欢迎(.+?)光临");
        Matcher matcher = pattern.matcher(data);
        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
}
