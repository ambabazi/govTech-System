package services;

import java.util.List;
import java.util.ArrayList;
import application.ServiceApplication;

public class ApplicationManager {
    
    private List<ServiceApplication> applications;

    public ApplicationManager() {
        this.applications = new ArrayList<>();
    }

    public void submitApplication(ServiceApplication application) {
        applications.add(application);
    }

    public void processApplications() {
        for (ServiceApplication application : applications) {

            if (application.getService().validateApplication()) {
                application.approve();
            } else {
                application.reject();
            }
        }
    }

    public List<ServiceApplication> getApplications() {
        return applications;
    }
}
