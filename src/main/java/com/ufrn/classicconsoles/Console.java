package com.ufrn.classicconsoles;

public class Console {
    private String name;
    private String generation;
    private String image;
    private int year;
    private String bestSellingGame;
    private String cpu;

    public Console(String name, String generation, String image, int year, String bestSellingGame, String cpu) {
        this.name = name;
        this.generation = generation;
        this.image = image;
        this.year = year;
        this.bestSellingGame = bestSellingGame;
        this.cpu = cpu;
    }

    public String getName() {
        return name;
    }

    public String getGeneration() {
        return generation;
    }

    public String getImage() {
        return image;
    }

    public int getYear() {
        return year;
    }

    public String getBestSellingGame() {
        return bestSellingGame;
    }

    public String getCpu() {
        return cpu;
    }
}
