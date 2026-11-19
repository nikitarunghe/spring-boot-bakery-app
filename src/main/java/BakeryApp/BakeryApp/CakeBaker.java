package BakeryApp.BakeryApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component; 

@Component 
public class CakeBaker {

   
    @Autowired 
    Frosting frosting;

    @Autowired
    Syrup syrup;
    
    public void bakeCake(){
        
        String frostingtype = frosting.getFrostingType();

        String syruptype = syrup.getSyrupType();

        System.out.println("Baking a delicious cake with " + frostingtype + " and " + syruptype + "!");

        
    }
}
