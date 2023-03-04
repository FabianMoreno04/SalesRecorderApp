package view;

import java.util.Scanner;

public class View {

    private Scanner console;

    public View() {
        console = new Scanner(System.in);
    }

    public int readInt(String message) {
        System.out.println(message);
        int number = Integer.parseInt(console.nextLine());
        return number;
    }

    public String readString(String message) {
        System.out.println(message);
        String value = console.nextLine();
        return value;
    }

    public double readDouble(String message) {
        System.out.println(message);
        double value = Double.parseDouble(console.nextLine());
        return value;
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}
