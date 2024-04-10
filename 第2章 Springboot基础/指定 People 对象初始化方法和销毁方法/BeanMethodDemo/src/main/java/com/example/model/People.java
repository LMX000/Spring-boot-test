package com.example.model;

public class People {
    String name;
    public People(String name)
    {
        this.name=name;
    }
    public void hello()
    {
        System.out.println("我叫"+name);
    }
    public void init()
    {
        System.out.println(name+"来了");
    }
    public void destroy()
    {
        System.out.println(name+"走了");
    }
}
