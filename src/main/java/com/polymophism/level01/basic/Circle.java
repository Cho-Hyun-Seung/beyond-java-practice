package com.polymophism.level01.basic;

public class Circle extends Shape implements Resizable{
    private double radius;

    public Circle(int radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void resize(double factor) {
        this.radius = this.radius * factor;
    }

    @Override
    double calculateArea() {
        return Math.pow(getRadius(),2) * Math.PI;
    }

    @Override
    double calculatePerimeter() {
        return getRadius() * 2 * Math.PI;
    }
}
