package com.workintech.cylinder;

public class Circle {
    private int radius;

    public Circle(int radius){
        this.radius = radius < 0 ? 0 : radius;

    }
    public int getRadius(){
        return this.radius;
    }
    public double getArea(){
        return  Math.PI * radius * radius;
    }
}
