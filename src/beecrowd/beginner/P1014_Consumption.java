package beecrowd.beginner;

import java.util.Scanner;

public class P1014_Consumption {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int km = input.nextInt();
        double fuelSpent = input.nextDouble();

        System.out.printf("%.3f km/l\n", ((double)km/fuelSpent));

        input.close();
    }
}
