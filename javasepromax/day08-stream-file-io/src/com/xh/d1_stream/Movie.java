package com.xh.d1_stream;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie implements Comparable<Movie>{
    private String name;
    private double score;
    private String actor;

    @Override
    public int compareTo(Movie o) {
        return Double.compare(this.score, o.score);
    }
}
