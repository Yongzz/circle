package za.ac.cput.circle.Impl;

import za.ac.cput.area.AreaInter;
import za.ac.cput.area.Impl.AreaImp;
import za.ac.cput.circle.*;
import za.ac.cput.circumference.CircumferenceInter;
import za.ac.cput.circumference.Impl.CircumferenceImp;
import za.ac.cput.diameter.DiameterInter;
import za.ac.cput.diameter.Impl.DiameterImp;


/**
 * Created by student on 2015/02/19.
 */
public class CircleModuleImp implements Circle {
    private AreaInter a = new AreaImp();
    private CircumferenceInter c = new CircumferenceImp();
    private DiameterInter d = new DiameterImp();
    @Override
    public double calcDiameter(double r) {

        return d.calcDiameter(r);
    }

    @Override
    public double calcCircumference(double r) {
        return c.calcCircuference(r);
    }

    @Override
    public double calcArea(double rad) {
        return a.calcArea(rad);
    }
}
