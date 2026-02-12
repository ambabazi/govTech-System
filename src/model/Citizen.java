package model;

public class Citizen {
   
   private final String phoneNumber;
   private final String names;
   private double balance;
   
   public Citizen(String phoneNumber, String names) {
      this.phoneNumber = phoneNumber;
      this.names = names;
      this.balance = 0;
   }

   public String getPhoneNumber() {
      return phoneNumber;
   }

   public String getNames() {
      return names;
   }
   
   public double getBalance() {
      return balance;
   }
   
   public void setBalance(double balance) {
      this.balance = balance;
   }
   
   public void deductBalance(double amount) {
      this.balance -= amount;
   }
}