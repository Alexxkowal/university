package org.knit.lab2.task4;

public abstract class Shape {
    double radius;
    public Shape(double radius) {
        this.radius = radius;
    }
    public abstract double getVolume();
}
