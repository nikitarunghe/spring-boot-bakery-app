package BakeryApp.BakeryApp;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

@ConditionalOnProperty(name = "bakeryapp.strawberry.enabled", havingValue = "true")

public class StrawBerry  implements Frosting, Syrup {

    @Override
    public String getFrostingType() {
        return "Strawberry Frosting";
    }

    @Override
    public String getSyrupType() {
        return "Strawberry Syrup";
    }
    
}
