package za.ac.cput.circle.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.area.AreaInter;
import za.ac.cput.area.Impl.AreaImp;
import za.ac.cput.circle.Circle;
import za.ac.cput.circle.Impl.CircleImp;
import za.ac.cput.circle.Impl.CircleModuleImp;
import za.ac.cput.circle.Impl.CircleMultipleImp;
import za.ac.cput.circumference.CircumferenceInter;
import za.ac.cput.diameter.DiameterInter;

/**
 * Created by student on 2015/02/20.
 */
@Configuration
public class AppConfig {
    @Bean(name = "cir")
    public Circle getCircle()
    {
        return new CircleImp();
    }

    @Bean(name = "circ")
    public Circle getCirceModuleImp()
    {
        return new CircleModuleImp();
    }

    @Bean(name ="cmArea")
    public AreaInter getCircleMultipleImp()
    {
        return new CircleMultipleImp();
    }
    @Bean(name = "cmCircum")
    public CircumferenceInter getCircumferenceInter()
    {
        return new CircleMultipleImp();
    }
    @Bean(name = "cmDiam")
    public DiameterInter getDiameter()
    {
        return new CircleMultipleImp();
    }
}
