package LinearEquation;

import java.util.Scanner;

public class main {
     public static void main(String[] args) {
            Scanner s1= new Scanner(System.in);
           double a=s1.nextDouble();
           double b=s1.nextDouble();
           double c=s1.nextDouble();
           double d=s1.nextDouble();
           double e=s1.nextDouble();
           double f=s1.nextDouble();

           LinearEquation l1 = new LinearEquation(a,b,c,d,e,f);

           if(l1.isSolvable()==false){

           System.out.println("Denklemin cozumu yok");
                   }
           else{
           System.out.println("Sonuc X="+l1.getx()+"Sonuc Y="+l1.gety());
           }

        }
    
}