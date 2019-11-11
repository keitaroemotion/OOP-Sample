package com.sugano.oop.builder;

public class Director
{
    private Builder builder; // 監督は作業員をこき使える
    public Director(Builder builder)
    {
        this.builder = builder; 
    }

    public String construct()
    {
        return this
            .builder
            .setWall  ("Green")
            .setWindow("Transparent")
            .setRoof  ("red") 
            .getResult();
    }
}


