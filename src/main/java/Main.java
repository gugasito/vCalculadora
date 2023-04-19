import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x1=0;
        double x2=0;
        double y1=0;
        double y2=0;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingrese la coordenada x del primer punto: "); //Siendo X1 y X2 las variables dej eje X para calcular la ecuacion de la recta
            x1 = sc.nextDouble();
            System.out.print("Ingrese la coordenada y del primer punto: ");
            y1 = sc.nextDouble();
            System.out.print("Ingrese la coordenada x del segundo punto: "); //Siendo Y1 y Y2 las variables dej eje Y para calcular la ecuacion de la recta
            x2 = sc.nextDouble();
            System.out.print("Ingrese la coordenada y del segundo punto: ");
            y2 = sc.nextDouble();
        }
        catch(InputMismatchException e){System.out.println("El caracter seleccionado no es valido, por favor intentelo de nuevo");
            System.exit(1);
        }
        double b = calcularB(x1, y1, x2, y2);
        double m = calcularM(x1, y1, x2, y2);
        System.out.println("La ecuación de la recta es y = " + b + "x + " + m);
    }

    public static double calcularB(double x1, double y1, double x2, double y2) {
        double [] ecuacionRecta = new double[2];
        double m = (y2 - y1) / (x2 - x1); // pendiente (m)
        double b = y1 - m * x1; // ordenada en el origen, m es pendiente
        ecuacionRecta[1] = b;
        return b;
    }
    public static double calcularM(double x1, double y1, double x2, double y2) {
        double[] ecuacionRecta = new double[2];
        double m = (y2 - y1) / (x2 - x1); // pendiente (m)
        ecuacionRecta[0] = m;
        return m;
    }
}
