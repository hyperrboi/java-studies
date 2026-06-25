package beecrowd.loop;

import java.util.Scanner;

public class P1020_AgeInDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int days = input.nextInt();
        int[] amountDays = {365, 30};

        for(int day: amountDays){
            int age = days/day;

            if (day == 365) System.out.println(age + " ano(s)");
            else System.out.println(age + " mes(es)");

            days %= day;

        }

        System.out.println(days + " dia(s)");

        input.close();
    }
}
