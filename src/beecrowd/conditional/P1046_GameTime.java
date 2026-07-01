package beecrowd.conditional;

import java.util.Scanner;

public class P1046_GameTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int beginning = input.nextInt();
        int ending = input.nextInt();

        if (ending - beginning <= 0) overCondition(beginning, ending);
        else sameDayCondition(beginning, ending);

        input.close();
    }

    static void overCondition(int start, int end) {
        System.out.println("O JOGO DUROU " + (24 - (start - end)) + " HORA(S)");
    }

    static void sameDayCondition(int start, int end) {
        System.out.println("O JOGO DUROU " + (end - start) + " HORA(S)");
    }
}
