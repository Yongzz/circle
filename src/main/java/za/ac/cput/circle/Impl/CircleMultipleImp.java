package za.ac.cput.circle.Impl;

import za.ac.cput.area.AreaInter;
import za.ac.cput.circumference.CircumferenceInter;
import za.ac.cput.diameter.DiameterInter;

/**
 * Created by student on 2015/02/20.
 */
public class CircleMultipleImp implements AreaInter, CircumferenceInter, DiameterInter{




    @Override
    public double calcDiameter(double r) {
        return r * 2;
    }

    @Override
    public double calcCircuference(double r)
    {
        return (r*2) * 3.14;
    }

    @Override
    public double calcArea(double rad) {
        return (rad * rad)*3.14;
    }
}
