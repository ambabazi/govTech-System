import application.*;
import model.*;
import services.ApplicationManager;

public class Main {
    public static void main(String[] args) {

        Citizen citizen = new Citizen("+250784263044", "Agnes Marie");
    
        GovernmentService birthCertificateService = new BirthCertificateService();

        ServiceApplication application = new ServiceApplication(citizen, birthCertificateService, ApplicationStatus.PENDING);

        ApplicationManager manager = new ApplicationManager();

        manager.submitApplication(application);
        manager.processApplications();
        
        for(ServiceApplication app : manager.getApplications()) { 
            System.out.println(app);
        }
    
    }
}
