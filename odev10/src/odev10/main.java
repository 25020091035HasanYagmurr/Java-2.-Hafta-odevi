package odev10;
import java.util.Scanner;


public class main {
      
    public static void main(String[] args) {
        
        Scanner s1 =new Scanner(System.in);
        double a=s1.nextInt();
        double b=s1.nextInt();
        double c=s1.nextInt();
        
        QuadraticEquation q1=new QuadraticEquation(a,b,c);
        if(q1.getDiscriminant()>0){
            System.out.println("Kokler="+q1.getRoot1()+"/"+q1.getRoot2());
        }
        else{
            System.out.println("Denklemin koku yoktur");
        }
         
        
    }
    
}