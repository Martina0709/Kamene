package kamene;


import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Field field = new Field();

        while (true) {
            field.printField();
            System.out.println("Zadajte w (up), A (left), S (down), D (right)");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            handleInput(input.toUpperCase(Locale.ROOT), field);
        }
    }

    public static void handleInput(String input, Field field) {
        if (input.equals("A")) {
            field.pressA();
        } else if (input.equals("W")) {
            field.pressW();
        } else if (input.equals("S")) {
            field.pressS();
        } else if (input.equals("D")) {
            field.pressD();
        }

    }
}

