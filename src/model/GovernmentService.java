package model;

public class GovernmentService {
    
    private final String serviceName;
    private final double serviceFee;

    public GovernmentService(String serviceName, double serviceFee) {
        this.serviceName = serviceName;
        this.serviceFee = serviceFee;
    }

    public String getServiceName() {
        return serviceName;
        }
    public double getServiceFee() {
        return serviceFee;
    }
}
