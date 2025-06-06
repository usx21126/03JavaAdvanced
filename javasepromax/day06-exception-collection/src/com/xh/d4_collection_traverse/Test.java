package com.xh.d4_collection_traverse;

import java.util.ArrayList;
import java.util.Collection;

public class Test {
    public static void main(String[] args) {
        Collection<Movie> movies = new ArrayList<>();

        movies.add(new Movie("《消失的她》","倪妮，文咏珊",9.5));
        movies.add(new Movie("《八角笼中》","王宝强",7.5));
        movies.add(new Movie("《三万里》","李白",8.5));

        for(Movie m : movies){
            System.out.println(m.getName()+" "+m.getActor()+" "+m.getScore());
        }
        movies.forEach(s->System.out.println(s.getName()+" "+s.getActor()+" "+s.getScore()));

    }
}
