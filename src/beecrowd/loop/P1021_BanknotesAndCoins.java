package beecrowd.loop;

import java.util.Scanner;

public class P1021_BanknotesAndCoins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num = input.nextDouble();
        int total = (int)(num * 100);

        int[] notes = {10000, 5000, 2000, 1000, 500, 200};
        int[] coins = {100, 50, 25, 10, 5, 1};

        System.out.println("NOTA(S):");
        for (int note: notes) {
            int quantity = total / note;
            System.out.printf("%d nota(s) de R$ %.2f\n", quantity, (note / 100.00));
            total -= quantity * note;
        }

        System.out.println("MOEDA(S):");
        for (int coin: coins) {
            int quantity = total / coin;
            System.out.printf("%d moeda(s) de R$ %.2f\n", quantity, (coin / 100.00));
            total -= quantity * coin;
        }


        input.close();
    }
}
