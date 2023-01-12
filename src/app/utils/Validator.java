package app.utils;

import java.util.Scanner;

public class Validator {

    // Валідація веддення даних (тип даних - integer)
    public static int validateDataInput(Scanner scan) {
        int scanInt;
        do {
            if (scan.hasNextInt()) {
                scanInt = scan.nextInt();
                if (scanInt >= 0) {
                    break;
                } else {
                    System.out.print("Incorrect value!\nTry again: ");
                }
            } else {
                 outputNotNumber(scan);
            }
        } while (true);
        return scanInt;
    }

    // Валідація веддення ціни (тип даних - double)
    public static double validatePriceInput(Scanner scan) {
        double scanDouble;
        do {
            if (scan.hasNextDouble()) {
                scanDouble = scan.nextDouble();
                if (scanDouble > 0) {
                    break;
                } else {
                    System.out.print("Incorrect value!\nTry again: ");
                }
            } else {
                 outputNotNumber(scan);
            }
        } while (true);
        return scanDouble;
    }

    private static void outputNotNumber(Scanner scan){
        String str = scan.next().trim();
        System.out.printf("\"%s\" - not a number!%nTry again: ", str);
    }
}
