package com.xh.d1_stream;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

//Stream流常见方法
public class StreamTest3 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张燕", "张三丰");
        //1.过滤
//        list.stream().filter(s->s.startsWith("张")).filter(s->s.length()==3);
        list.stream().filter(s->s.startsWith("张") && s.length() == 3).forEach(System.out::println);

        //2.准备集合，排序
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("摔跤吧，爸爸", 9.5, "阿米尔汗"));
        movies.add(new Movie("三傻宝莱坞", 8.5, "阿米尔汗2"));
        movies.add(new Movie("三傻宝莱坞", 8.5, "阿米尔汗2"));
        movies.add(new Movie("阿甘正传", 7.5, "汤姆汉克斯 "));
//        movies.stream().sorted().forEach(System.out::println);
//        movies.stream().sorted((o1,o2)-> Double.compare(o1.getScore(), o2.getScore()));
        movies.stream().sorted(Movie::compareTo).forEach(System.out::println);

        //3.取前3个
        System.out.println("------------------------");
        movies.stream().sorted(Movie::compareTo).limit(3).forEach(System.out::println);

        //4.跳过前3个
        System.out.println("------------------------");
        movies.stream().sorted(Movie::compareTo).skip(3).forEach(System.out::println);

        //5.去重
        System.out.println("------------------------");
        movies.stream().sorted(Movie::compareTo).distinct().forEach(System.out::println);

        //6.map加工
        System.out.println("------------------------");
        movies.stream().map(m->m.getName()+"-->"+m.getScore()).forEach(System.out::println);

        //7.合并流
        System.out.println("------------------------");
        Stream<String> s1 = Stream.of("<A>", "<B>", "<C>", "<D>", "<F>");
        Stream<String> s2 = Stream.of("<E>", "<G>", "<H>");
        Stream<String> s3 = Stream.concat(s1, s2);
        s3.forEach(System.out::println);
        //终结方法
        //max
        System.out.println("-----------------------");
        Movie movie = movies.stream().max((o1, o2)->Double.compare(o1.getScore(),o2.getScore())).get();
        System.out.println(movie);
    }
}
