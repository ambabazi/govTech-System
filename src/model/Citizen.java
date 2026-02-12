package model;

public class Citizen {
   
   private final String phoneNumber;
   private final String names;
   
   public Citizen(String phoneNumber, String names) {
      this.phoneNumber = phoneNumber;
      this.names = names;
   }

   public String getPhoneNumber() {
      return phoneNumber;
   }

   public String getNames() {
      return names;
   }
}