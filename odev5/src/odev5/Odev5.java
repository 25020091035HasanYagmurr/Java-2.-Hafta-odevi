
package odev5;

import java.util.GregorianCalendar;

public class Odev5 {

    
    public static void main(String[] args) {
        GregorianCalendar takvim = new GregorianCalendar();
      
      
      System.out.println(" yil " +GregorianCalendar.YEAR);
      System.out.println(" ay " + GregorianCalendar.MONTH + 1 );
      System.out.println( " gun " + GregorianCalendar.DAY_OF_MONTH);
      
      takvim.setTimeInMillis(1234567898765L);
      
      System.out.println("yil" + takvim.get(GregorianCalendar.YEAR));
      System.out.println("ay" + takvim.get(GregorianCalendar.MONTH) + 1 );
      System.out.println(" gun " + takvim.get(GregorianCalendar.DAY_OF_MONTH));
   
    }
    
}
