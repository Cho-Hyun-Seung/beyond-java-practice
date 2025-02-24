package com.polymophism.level01.basic;

public class Rectangle extends Shape implements Resizable{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void resize(double factor) {
        this.height = height * factor;
        this.width = width * factor;
    }

    @Override
    double calculateArea() {
        return getHeight() * getWidth();
    }

    @Override
    double calculatePerimeter() {
        return (getHeight() + getWidth()) * 2;
    }
}
