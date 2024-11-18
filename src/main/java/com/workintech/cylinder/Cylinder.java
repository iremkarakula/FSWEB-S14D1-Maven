package com.workintech.cylinder;

public class Cylinder extends Circle {
    private int height;

    public Cylinder(int radius, int height){
        super(radius);
       this.height = height < 0 ? 0 : height;
    }

    public int getHeight() {
        return height;
    }


    public double getVolume() {
        return super.getArea() * height;
    }
}
