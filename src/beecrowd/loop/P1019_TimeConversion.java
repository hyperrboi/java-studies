package beecrowd.loop;

import java.util.Scanner;

public class P1019_TimeConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int seconds = input.nextInt();
        int[] time = {3600, 60};

        for(int measure: time){
            int quantity = seconds/measure;
            System.out.print(quantity + ":");
            seconds %= measure;
        }

        System.out.println(seconds);

        input.close();
    }
}
