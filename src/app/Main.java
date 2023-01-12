package app;

import app.controllers.OrderAController;
import app.controllers.OrderBController;
import app.utils.Validator;

import java.util.Scanner;

public class Main {

    static Scanner scanner;

    public static void main(String[] args) {
        filterOption(getOption());
    }

    private static int getOption() {
        System.out.println("""
                Choose an option:
                1 - order without delivery
                2 - order with delivery
                """);
        scanner = new Scanner(System.in);
        return Validator.validateDataInput(scanner);
    }

    private static void filterOption(int option) {
        switch (option) {
            case 1 -> {
                OrderAController controller = new OrderAController();
                controller.handleData();
            }
            case 2 -> {
                OrderBController controller = new OrderBController();
                controller.handleData();
            }
        }
    }
}
