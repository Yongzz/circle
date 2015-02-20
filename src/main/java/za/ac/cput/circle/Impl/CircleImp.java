package za.ac.cput.circle.Impl;
import za.ac.cput.circle.*;

/**
 * Created by student on 2015/02/19.
 */
public class CircleImp  implements Circle {

    @Override
    public double calcDiameter(double r) {
        return r * 2;
    }

    @Override
    public double calcCircumference(double r) { return r*2 * 3.14;}

    @Override
    public double calcArea(double rad) {
        return (rad * rad)*3.14;
    }
}
