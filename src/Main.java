import model.*;

public class Main {
    public static void main(String[] args) {
        Citizen citizen = new Citizen("0784263044", "Agnes Mbabazi");

        System.out.println(citizen.getNames() + " " + citizen.getPhoneNumber() + ".");

        BirthCertificateService birthCertificateService = new BirthCertificateService();
        System.out.println("Service: " + birthCertificateService.getServiceName() + ", Fee: " + birthCertificateService.getServiceFee());

        PassportService passportService = new PassportService();
        System.out.println("Service: " + passportService.getServiceName() + ", Fee: " + passportService.getServiceFee());
    }}
