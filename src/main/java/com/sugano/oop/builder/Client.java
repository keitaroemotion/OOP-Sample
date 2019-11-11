package com.sugano.oop.builder;

public class Client
{
    public void main()
    {
        Director director = new Director(new ConcreteBuilder());
    }
}
