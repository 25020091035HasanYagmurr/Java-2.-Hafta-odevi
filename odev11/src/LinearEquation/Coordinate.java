package LinearEquation;
import java.util.Scanner;
public class Coordinate {


    public static void main(String[] args) {
    Scanner s2=new Scanner(System.in);
        double x1 = s2.nextDouble();
        double y1 = s2.nextDouble();
        double x2 = s2.nextDouble();
        double y2 = s2.nextDouble();
        double x3 = s2.nextDouble();
        double y3 = s2.nextDouble();
        double x4 = s2.nextDouble();
        double y4 = s2.nextDouble();

        double a = y1 - y2;
        double b = -(x1 - x2);
        double c = y3 - y4;
        double d = -(x3 - x4);
        double e = (y1 - y2) * x1 - (x1 - x2) * y1;
        double f = (y3 - y4) * x3 - (x3 - x4) * y3;
        LinearEquation l2=new LinearEquation(a,b,c,d,e,f);
      
        if (l2.isSolvable()==false) {
            System.out.println("Kesisme Noktasi Yok");
        } else {
            System.out.println( "Kesisme Noktasi"+l2.getx() + "/ " + l2.gety() );
        }
        }
}