
package odev4;

import java.util.Random;

public class Odev4 {

   
    public static void main(String[] args) {
        Random rastgelesayi = new Random(1000) ;
        
        for(int i=0; i<50 ; i++){
            System.out.println(rastgelesayi.nextInt(100));
        }
       
    }
    
}
