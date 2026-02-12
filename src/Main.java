import application.*;
import model.*;
import services.ApplicationManager;
import exceptions.*;

public class Main {
    public static void main(String[] args) {

        Citizen citizen = new Citizen("+250784263044", "Agnes Marie");
        citizen.setBalance(1000);
    
        GovernmentService birthCertificateService = new BirthCertificateService();

        ServiceApplication application = new ServiceApplication(citizen, birthCertificateService, ApplicationStatus.PENDING);

        ApplicationManager manager = new ApplicationManager();

        try {
            manager.submitApplication(application);
            System.out.println("Application submitted successfully");
        } catch (InvalidApplication | InsufficientBalance e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        manager.processApplications();
        
        for(ServiceApplication app : manager.getApplications()) { 
            System.out.println(app);
        }
    
    }
}
