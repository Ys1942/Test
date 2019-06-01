package com.ys;

public class Human extends Animal {
    private String country;
//    public Human(String name, int age) {
//        super(name, age);
//    }

    //这里也在本地做了修改
    public Human(String name, int age, String country) {
        super(name, age);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public void say() {
        System.out.println("This is "+getName()+" from "+getCountry());
    }
}
