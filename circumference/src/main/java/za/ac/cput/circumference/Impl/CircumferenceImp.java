package za.ac.cput.circumference.Impl;

import za.ac.cput.circumference.CircumferenceInter;

/**
 * Created by student on 2015/02/19.
 */

public class CircumferenceImp implements CircumferenceInter {
    @Override
    public double calcCircuference(double r) {
        return (r*2) * 3.14;
    }
}
