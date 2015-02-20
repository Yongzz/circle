package za.ac.cput.area.Impl;

import za.ac.cput.area.AreaInter;

/**
 * Created by student on 2015/02/19.
 */
public class AreaImp implements AreaInter {

    @Override
    public double calcArea(double r) {
        return 3.14 * (r*r);
    }
}
