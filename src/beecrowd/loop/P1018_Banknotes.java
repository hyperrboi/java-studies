package beecrowd.loop;

import java.util.Scanner;

public class P1018_Banknotes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();

        int[] notes = {100, 50, 20, 10, 5, 2, 1};
        int total = x;
        System.out.println(x);

        for(int note: notes){
            int quantity = total/note;
            System.out.println(quantity + " nota(s) de R$ " + note + ",00");
            total -= quantity*note;
        }

        input.close();
    }
}
