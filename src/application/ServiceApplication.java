package application;

import model.Citizen;
import model.GovernmentService;

public class ServiceApplication {
    
    private Citizen applicant;
    private GovernmentService service;
    private ApplicationStatus status;

    public ServiceApplication(Citizen applicant, GovernmentService service,ApplicationStatus status) {
        this.applicant = applicant;
        this.service = service;
        this.status = status;
    }
    public Citizen getApplicant() {
        return applicant;
        }

    public GovernmentService getService() {
        return service;
    }    

    public ApplicationStatus getStatus() {
        return status;
    }
    public void approve() {
        this.status = ApplicationStatus.APPROVED;
    }
    public void reject() {
        this.status = ApplicationStatus.REJECTED;
    }
    
    @Override
    public String toString() {
        return "ServiceApplication{" +
                "applicant=" + applicant.getNames() +
                ", service=" + service.getServiceName() +
                ", fee=" + service.getServiceFee() +
                ", status=" + status +
                '}';
    }
}