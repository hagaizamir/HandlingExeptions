package edu.Hagai.java;

import com.sun.javaws.exceptions.InvalidArgumentException;

/**
 * Created by Android2017 on 3/14/2017.
 */
public class Circle {
    private double radius;

    public Circle(double radius) throws Exception {
        if (radius<0)
            throw new Exception();
        this.radius = radius;
    }
}
