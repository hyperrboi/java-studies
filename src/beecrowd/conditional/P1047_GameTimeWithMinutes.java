package beecrowd.conditional;

import java.util.Scanner;

public class P1047_GameTimeWithMinutes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int initialHour = input.nextInt();
        int initialMinute = input.nextInt();
        int finalHour = input.nextInt();
        int finalMinute = input.nextInt();

        totalCalc(initialHour, initialMinute, finalHour, finalMinute);

        input.close();
    }

    static void totalCalc(int iHour, int iMin, int fHour, int fMin) {
        int totalHours = 0;
        int totalMinutes;

        if ((fMin - iMin) < 0) {
            totalMinutes = (fMin - iMin) + 60;
            totalHours--;
        } else {
            totalMinutes = (fMin - iMin);
        }

        if ((fHour - iHour <= 0)) {
            totalHours += (fHour - iHour) + 24;
        } else {
            totalHours += (fHour - iHour);
        }

        System.out.println("O JOGO DUROU " + totalHours + " HORA(S) E " + totalMinutes + " MINUTO(S)");
    }
}
