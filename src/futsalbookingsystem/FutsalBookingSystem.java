
package futsalbookingsystem;

import futsalbookingsystem.controller.RegistrationController;
import futsalbookingsystem.view.RegistrationView;


public class FutsalBookingSystem {

public static void main(String[] args) {
    RegistrationView registrationViewFrame = new RegistrationView(); 
    RegistrationController controller = new RegistrationController(registrationViewFrame);
    controller.open();
}

}

       
    

