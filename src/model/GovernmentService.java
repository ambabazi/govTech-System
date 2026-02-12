package model;

public class GovernmentService {
    
    private final String serviceName;
    private final String serviceFee;

    public GovernmentService(String serviceName, String serviceFee) {
        this.serviceName = serviceName;
        this.serviceFee = serviceFee;
    }

    public String getServiceName() {
        return serviceName;
        }
    public String getServiceFee() {
        return serviceFee;
    }
}
