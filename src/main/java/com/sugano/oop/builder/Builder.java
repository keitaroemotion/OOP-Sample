package com.sugano.oop.builder;

// 作業員
public abstract class Builder
{
    public House house;
    public Builder()
    {
        this.house = new House(); 
    }

    public abstract Builder setRoof  (String roof);
    public abstract Builder setWall  (String wall);
    public abstract Builder setWindow(String window);
    public abstract String  getResult();
}
