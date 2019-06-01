package com.ys;

public class Animal implements Talking{
    private String name;
    private int age;
    //这里做了第一次修改
    //这里在本地做了第一次修改

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //这里在本地做了第二次修改，第二个commit
    public String getName() {
        return name;
    }

    //这里也是本地第二次修改
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void say() {
        System.out.println("This is Animal");
    }
}
