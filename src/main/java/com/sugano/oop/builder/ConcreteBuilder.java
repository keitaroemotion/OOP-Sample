package com.sugano.oop.builder;

// 広島建設の作業員
public class ConcreteBuilder extends Builder
{
    public House house;
    public ConcreteBuilder()
    {
        this.house = new House(); 
    }

    public Builder setRoof(String roof)
    {
        this.house.roof = roof;
        return this; // ここ重要
    }

    public Builder setWall(String wall)
    {
        this.house.wall = wall;
        return this;
    }

    public Builder setWindow(String window)
    {
        this.house.window = window;
        return this;
    }

    public String getResult()
    {
        // return this; 
        return this.toString();
    }
}
