package date_odevi;

import java.util.Date;

public class   DataTest {

public static void main(String[] args){
    
    long zamanlar[] ={
        10000,
        100000,
        1000000,
        10000000,
        100000000,
        1000000000,
        10000000000L,
        100000000000L
    };
    Date tarih = new Date() ;
    
    for(int i = 0 ; i<zamanlar.length;i++){
      tarih.setTime(zamanlar[i]);
        System.out.println(zamanlar[i] + "  ms sonraki zaman" + tarih.toString());
    }
    
}
}


