package EntitiesDB;

import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author NecrQ
 */

@Named
@RequestScoped
@Stateless
public class Event {
    
    public String welcome() {
        return "Labas";
    }
    
}
