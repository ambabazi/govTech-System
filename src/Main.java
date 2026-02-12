import model.Citizen;

public class Main {
    public static void main(String[] args) {
        Citizen citizen = new Citizen("0784263044", "Agnes Mbabazi");

        System.out.println(citizen.getNames() + " can be reached at " + citizen.getPhoneNumber() + ".");
    }
}