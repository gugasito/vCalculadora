import java.util.Scanner;

public class Main {
    static double solCuadratic2(double A, double B, double C) {
        double sol;
        sol = (-B - (Math.sqrt((B * B) - 4 * A * C))) / (2 * A);
        return sol;
    }

    public static double solCuadratic1(double A, double B, double C) {
        double sol;
        sol = (-B + (Math.sqrt((B * B) - 4 * A * C))) / (2 * A);
        return sol;
    }

    public static void llamarEcuacion() {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese su ecuación de la forma: Ax^2 + Bx + C = 0");
        System.out.println("A:");
        double A = s.nextDouble();
        System.out.println("B:");
        double B = s.nextDouble();
        System.out.println("C:");
        double C = s.nextDouble();
        if (comprobarEc(A, B, C)) {
            System.out.println("Las soluciones son imaginarias");
        } else {
            try {
                System.out.println(solCuadratic1(A, B, C));
                System.out.println(solCuadratic2(A, B, C));
            } catch (Exception e) {
                System.out.println("Error en las entradas, ingrese nuevamente");
                llamarEcuacion();
            }

        }

    }

    public static boolean comprobarEc(double A, double B, double C) {
        return ((B * B) - 4 * A * C) < 0;
    }
}