package com.xh.d4_collection_traverse;

public class Movie {
    private String name;
    private String actor;
    private double score;

    public Movie() {
    }

    public Movie(String name, String actor, double score) {
        this.name = name;
        this.actor = actor;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", actor='" + actor + '\'' +
                ", score=" + score +
                '}';
    }
}
