package com.display20prime;
import java.lang.Math;

public class Circle extends Geometric {
    private double radius;


    public Circle(){}

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, String filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }

    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    public double getDiameter() {
        return 2*radius;
    }
}
