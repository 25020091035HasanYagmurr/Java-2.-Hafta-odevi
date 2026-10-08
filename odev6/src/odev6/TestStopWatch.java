package odev6;

import java.util.Random;

public class TestStopWatch {
    
    public static void main(String[] args) {
        
        int[] numbers = new int[100000];
        Random random = new Random();
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100000);
        }

        StopWatch stopWatch = new StopWatch();
        System.out.println("Siralama basladi, lutfen bekleyin...");
        
        for (int i = 0; i < numbers.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = numbers[minIndex];
            numbers[minIndex] = numbers[i];
            numbers[i] = temp;
        }
        
        stopWatch.stop();
        System.out.println("100.000 sayinin Selection Sort ile siralanma suresi: " + stopWatch.getElapsedTime() + " milisaniye.");
    }
}