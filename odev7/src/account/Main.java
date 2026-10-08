package account;

import java.time.LocalDate;


public class Main {
     public static void main(String[] args) {
       Account a1= new Account(1122,20000.0);
       a1.setAnnuallnterestRate(4.5);
       a1.withdraw(2500);
       a1.deposit(3000);
       LocalDate createdDate=LocalDate.now();
       
          System.out.println("Faiz orani="+a1.annuallnterestRate);
          System.out.println("Bakiye="+a1.balance);
          System.out.println("Hesabin olusturulma tarihi="+createdDate);


    }
    
}