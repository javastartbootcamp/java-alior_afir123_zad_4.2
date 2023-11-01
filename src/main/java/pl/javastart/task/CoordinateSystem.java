package pl.javastart.task;

import java.util.Scanner;

public class CoordinateSystem {
    int x;
    int y;

    void run(Scanner scanner) {
        System.out.println("Podaj współrzędną X");
        x = scanner.nextInt();
        System.out.println("Podaj współrzędną Y");
        y = scanner.nextInt();
        System.out.println("Twój punkt to (" + x + "," + y + ")");
    }

    String pointCheck(Point point) {
        if (point.x != 0 && point.y == 0) {
            return "Punkt znajduje się na osi X";
        } else if (point.x == 0 && point.y != 0) {
            return "Punkt znajduje się na osi Y";
        } else if (point.x > 0 && point.y > 0) {
            return "Punkt znajduje się w I Ćwiartce";
        } else if (point.x > 0 && point.y < 0) {
            return "Punkt znajduje się w IV Ćwiartce";
        } else if (point.x < 0 && point.y > 0) {
            return "Punkt znajduje się w II Ćwiartce";
        } else if (point.x < 0 && point.y < 0) {
            return "Punkt znajduje się w III Ćwiartce";
        }
        return "Punkt znajduje się na środku układu współrzędnych";
    }
}
