package app.views;

import app.utils.Validator;

import java.util.Scanner;

public class OrderView {

    public String[] getData() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter order code: ");
        String code = String.valueOf(Validator.validateDataInput(scanner));
//        String code = scanner.nextLine();
        System.out.print("Enter product quota, pcs.: ");
        String quota = String.valueOf(Validator.validateDataInput(scanner));
//        String quota = scanner.nextLine();
        System.out.print("Enter product price, USD: ");
        String price = String.valueOf(Validator.validatePriceInput(scanner));
//        String price = scanner.nextLine();

        return new String[] {code, quota, price};
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
