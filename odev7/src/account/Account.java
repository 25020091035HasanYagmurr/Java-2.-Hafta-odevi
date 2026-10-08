package account;
import java.time.LocalDate;
public class Account {

    private int id;
    double balance;
    double annuallnterestRate;
    
    public Account(int id,double balance){
    this.id=id;
    this.balance=balance;
    }
    public double getid(double id){
        
        return this.id;
        
    }
    public void setid(int id){
        this.id=id;
    }
    
        public double getBalance(double balance){
        
        return this.balance;
        
    }
    public void setBalance(double balance){
     this.balance=balance;
    }
     public double getAnnuallnterestRate(double annuallnterestRate){
        
        return this.annuallnterestRate;
        
    }
    public void  setAnnuallnterestRate(double annuallnterestRate){
     this.annuallnterestRate=annuallnterestRate;
    }
    
 
    public double  getMonthlyInterestRate(){
        double MonthlyInterestRate=(this.annuallnterestRate/100)/12;
        return MonthlyInterestRate;
    }
    public void withdraw(double miktar){
        this.balance=balance-miktar;
    
    }
      public void deposit(double miktar){
        this.balance=this.balance+miktar;
    
    }
    
   
    
}