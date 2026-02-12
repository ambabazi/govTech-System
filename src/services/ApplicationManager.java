package services;

import application.ServiceApplication;
import exceptions.*;
import java.util.ArrayList;
import java.util.List;

public class ApplicationManager {
    
    private List<ServiceApplication> applications;

    public ApplicationManager() {
        this.applications = new ArrayList<>();
    }

    public void submitApplication(ServiceApplication application)
            throws InvalidApplication, InsufficientBalance {

        if (!application.getService().validateApplication()) {
            throw new InvalidApplication("Service validation failed.");
        }

        double fee = application.getService().getServiceFee();

        if (application.getApplicant().getBalance() < fee) {
            throw new InsufficientBalance("Not enough balance to pay service fee.");
        }

        application.getApplicant().deductBalance(fee);

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
