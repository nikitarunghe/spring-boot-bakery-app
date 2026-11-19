package BakeryApp.BakeryApp;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "bakeryapp.chocolate.enabled", havingValue = "true")
public class Chocolate implements Frosting, Syrup {

    @Override
    public String getFrostingType() {
        return "Chocolate Frosting";
    }

    @Override
    public String getSyrupType() {
        return "Chocolate Syrup";
    }
    
}
