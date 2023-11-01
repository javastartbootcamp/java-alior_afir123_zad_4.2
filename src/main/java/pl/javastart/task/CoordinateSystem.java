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
        Point point1 = new Point(x, y);
        System.out.println(pointCheck(point1));
    }

    String pointCheck(Point point) {
        if (point.x != 0 && point.y == 0) {
            return "Punkt (" + point.x + "," + point.y + ") leży na osi X";
        } else if (point.x == 0 && point.y != 0) {
            return "Punkt (" + point.x + "," + point.y + ") leży na osi Y";
        } else if (point.x > 0 && point.y > 0) {
            return "Punkt (" + point.x + "," + point.y + ") leży w I ćwiartce układu współrzędnych";
        } else if (point.x > 0 && point.y < 0) {
            return "Punkt (" + point.x + "," + point.y + ") leży w IV ćwiartce układu współrzędnych";
        } else if (point.x < 0 && point.y > 0) {
            return "Punkt (" + point.x + "," + point.y + ") leży w II ćwiartce układu współrzędnych";
        } else if (point.x < 0 && point.y < 0) {
            return "Punkt (" + point.x + "," + point.y + ") leży w III ćwiartce układu współrzędnych";
        }
        return "Punkt (" + point.x + "," + point.y + ") leży na środku układu współrzędnych";
    }
}
