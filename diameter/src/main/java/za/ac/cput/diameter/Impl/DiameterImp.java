package za.ac.cput.diameter.Impl;

import za.ac.cput.diameter.DiameterInter;

/**
 * Created by student on 2015/02/19.
 */
public class DiameterImp implements DiameterInter {

    @Override
    public double calcDiameter(double radius) {
        return radius * 2;
    }
}
