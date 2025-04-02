package org.example;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    static final double PI = 3.14159;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double radius = 0;
        double area = 0;
        radius = sc.nextDouble();
        area = getArea(radius);

        System.out.printf("A=%.4f \n", area);
    }

    public static double getArea(double radius) {
        return PI * Math.pow(radius, 2);
    }
}