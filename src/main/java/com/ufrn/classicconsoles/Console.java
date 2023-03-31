package com.ufrn.classicconsoles;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "consoles") // this class represents a mongodb document!
public class Console {
    @Id
    private String id;
    private String name;
    private String generation;
    private String image;
    private int year;
    private String bestSellingGame;
    private int ranking;

    public Console() {
        // it will be used by spring
    }

    public Console(String name, String generation, String image, int year, String bestSellingGame, int ranking) {
        this.name = name;
        this.generation = generation;
        this.image = image;
        this.year = year;
        this.bestSellingGame = bestSellingGame;
        this.ranking = ranking;
    }

    public String getId() {
        return id;
    }

    public int getRanking() {
        return ranking;
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

}
