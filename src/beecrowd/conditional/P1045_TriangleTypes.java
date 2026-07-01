package beecrowd.conditional;

import java.util.Scanner;

public class P1045_TriangleTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] sides = new double[3];

        for (int i = 0; i < 3; i++) {
            sides[i] = input.nextDouble();
        }

        double[] sortedSides = sidesSorter(sides);
        typeOfTriangle(sortedSides);

        input.close();
    }

    static double[] sidesSorter(double[] sides) {
        double aux = 0.0;
        for (int i = 0; i < sides.length; i++) {
            for (int j = i + 1; j < sides.length; j++) {
                if (sides[i] < sides[j]) {
                    aux = sides[i];
                    sides[i] = sides[j];
                    sides[j] = aux;
                }
            }
        }
        return sides;
    }

    static void typeOfTriangle(double[] sortedSides) {
        if (sortedSides[0] >= (sortedSides[1] + sortedSides[2])) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (Math.pow(sortedSides[0], 2) == Math.pow(sortedSides[1], 2) + Math.pow(sortedSides[2], 2)) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (Math.pow(sortedSides[0], 2) > Math.pow(sortedSides[1], 2) + Math.pow(sortedSides[2], 2)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (Math.pow(sortedSides[0], 2) < Math.pow(sortedSides[1], 2) + Math.pow(sortedSides[2], 2)) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if ((sortedSides[0] == sortedSides[1]) && (sortedSides[1] == sortedSides[2])) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (sortedSides[0] == sortedSides[1] || sortedSides[1] == sortedSides[2] || sortedSides[0] == sortedSides[2]) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}
