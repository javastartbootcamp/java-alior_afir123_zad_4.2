package pl.javastart.task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CoordinateSystem coordinateSystem = new CoordinateSystem();
        Scanner scanner = new Scanner(System.in);
        coordinateSystem.run(scanner);

        Point point1 = new Point(coordinateSystem.x, coordinateSystem.y);
        String result = coordinateSystem.pointCheck(point1);
        System.out.println(result);
    }
}
