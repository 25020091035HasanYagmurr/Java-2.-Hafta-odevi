package location;
import java.util.Scanner;

public class Location {
    public int row;
    public int column;
    public double maxValue;

    public static Location locateLargest(double[][] a) {
        Location loc = new Location();
        loc.row = 0;
        loc.column = 0;
        loc.maxValue = a[0][0];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > loc.maxValue) {
                    loc.maxValue = a[i][j];
                    loc.row = i;
                    loc.column = j;
                }
            }
        }
        return loc;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matrisin satir ve sutun sayisini girin: ");
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        double[][] matris = new double[rows][columns];

        System.out.println("Matrisin elemanlarini girin:");
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                matris[i][j] = scanner.nextDouble();
            }
        }

        Location enBuyuk = locateLargest(matris);

        System.out.println("En buyuk eleman: " + enBuyuk.maxValue +", konumu: (" + enBuyuk.row + ", " + enBuyuk.column + ")");

        scanner.close();
    }
}