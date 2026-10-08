
package odev9;


public class main {
    public static void main(String[] args) {
   
   RegularPolygon r1=new RegularPolygon();   
   RegularPolygon r2=new RegularPolygon(6,4);
   RegularPolygon r3=new RegularPolygon(10, 4,5.6,7.8);    

   System.out.println("1.Alan="+r1.getArea()+"/1.Cevre"+r1.getPerimeter());
      System.out.println("2.Alan="+r2.getArea()+"/2.Cevre"+r2.getPerimeter());
      System.out.println("3.Alan="+r3.getArea()+"/3.Cevre"+r3.getPerimeter());

    }
}