import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        Scanner entrada = new Scanner(System.in);
        while(true){
            System.out.println("Operaciones que se pueden realizar");
            System.out.println("1 Perímetro de un Cuadrado");
            System.out.println("2 Área de un Cuadrado");
            System.out.println("3 Perímetro de un Rectangulo");
            System.out.println("4 Área de un Rectangulo");
            System.out.println("5 Perímetro de un Circulo");
            System.out.println("6 Área de un Circulo");
            System.out.println("7 Área superficial de una Esfera");
            System.out.println("8 Volumen de una Esfera");
            System.out.println("9 Área superficial de un Cubo");
            System.out.println("10 Volumen de un Cubo");
            System.out.println("11 Área superficial de un Cono");
            System.out.println("12 Volumen de un Cono");
            System.out.println("13 Salir");
            System.out.println("Ingrese el número de la operación que desea realizar: ");
            int opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Ingrese el valor de un lado del Cuadrado: ");
                    double lado = entrada.nextDouble();
                    double x1 = perimetroCuadrado(lado);
                    System.out.println("El resultado es: " + x1);
                    break;
                case 2:
                    System.out.println("Ingrese el valor de un lado del Cuadrado: ");
                    double lado1 = entrada.nextDouble();
                    double x2 = areaCuadrado(lado1);
                    System.out.println("El resultado es: " + x2);
                    break;
                case 3:
                    System.out.println("Ingrese el valor del largo del Rectangulo: ");
                    double largo = entrada.nextDouble();
                    System.out.println("Ingrese el valor del ancho del Rectangulo: ");
                    double ancho = entrada.nextDouble();
                    double x3 = perimetroRectangulo(largo, ancho);
                    System.out.println("El resultado es: " + x3);
                    break;
                case 4:
                    System.out.println("Ingrese el valor del largo del Rectangulo: ");
                    double largo1 = entrada.nextDouble();
                    System.out.println("Ingrese el valor del ancho del Rectangulo: ");
                    double ancho1 = entrada.nextDouble();
                    double x4 = areaRectangulo(largo1, ancho1);
                    System.out.println("El resultado es: " + x4);
                    break;
                case 5:
                    System.out.println("Ingrese el valor del radio del Circulo: ");
                    double radio = entrada.nextDouble();
                    double x5 = perimetroCirculo(radio);
                    System.out.println("El resultado es: " + x5);
                    break;
                case 6:
                    System.out.println("Ingrese el valor del radio del Circulo: ");
                    double radio1 = entrada.nextDouble();
                    double x6 = areaCirculo(radio1);
                    System.out.println("El resultado es: " + x6);
                    break;
                case 7:
                    System.out.println("Ingrese el valor del radio de la Esfera: ");
                    double radio2 = entrada.nextDouble();
                    double x7 = areaSuperficialEsfera(radio2);
                    System.out.println("El resultado es: " + x7);
                    break;
                case 8:
                    System.out.println("Ingrese el valor del radio de la Esfera: ");
                    double radio3 = entrada.nextDouble();
                    double x8 = volumenEsfera(radio3);
                    System.out.println("El resultado es: " + x8);
                    break;
                case 9:
                    System.out.println("Ingrese el valor de una de las aristas del Cubo: ");
                    double arista = entrada.nextDouble();
                    double x9 = areaSuperficialCubo(arista);
                    System.out.println("El resultado es: " + x9);
                    break;
                case 10:
                    System.out.println("Ingrese el valor de la arista del Cubo: ");
                    double arista1 = entrada.nextDouble();
                    double x10 = volumenCubo(arista1);
                    System.out.println("El resultado es: " + x10);
                    break;
                case 11:
                    System.out.println("Ingrese el valor del radio del Cono: ");
                    double radio4 = entrada.nextDouble();
                    System.out.println("Ingrese el valor de la altura inclinada del Cubo: ");
                    double alturaInclinada = entrada.nextDouble();
                    double x11 = areaSuperficialCono(radio4, alturaInclinada);
                    System.out.println("El resultado es: " + x11);
                    break;
                case 12:
                    System.out.println("Ingrese el valor del radio del Cono: ");
                    double radio5 = entrada.nextDouble();
                    System.out.println("Ingrese el valor de la altura del Cubo: ");
                    double altura = entrada.nextDouble();
                    double x12 = volumenCono(radio5, altura);
                    System.out.println("El resultado es: " + x12);
                    break;
                case 13:
                    System.exit(0);
            }
        }
    }
    public static double perimetroCuadrado(double lado){
        return (lado*4);
    }
    public static double areaCuadrado(double lado){
        return (Math.pow(lado,2));
    }

    public static double perimetroRectangulo(double largo, double ancho){
        return (largo*2 + ancho*2);
    }
    public static double areaRectangulo(double largo, double ancho){
        return (largo*ancho);
    }

    public static double perimetroCirculo(double radio){
        double pi = 3.14;
        return (2*pi*radio);
    }
    public static double areaCirculo(double radio){
        double pi = 3.14;
        return (pi*Math.pow(radio,2));
    }
    public static double areaSuperficialEsfera(double radio){
        double pi = 3.14;
        return 4*pi*Math.pow(radio,2);
    }
    public static double volumenEsfera(double radio){
        double pi = 3.14;
        return ((3/4)*pi*Math.pow(radio,3));
    }
    public static double areaSuperficialCubo(double arista){
        return 6*Math.pow(arista,2);
    }
    public static double volumenCubo(double arista){
        return Math.pow(arista,3);
    }
    public static double areaSuperficialCono(double radio, double alturaInclinada){
        double pi = 3.14;
        return (pi*Math.pow(radio,2) + pi*radio*alturaInclinada);
    }
    public static double volumenCono(double radio, double altura){
        double pi = 3.14;
        return (pi*Math.pow(radio,2)*altura)/3;
    }
    public static void solucionSistemaEcuaciones() {
        double A = 0;
        double B = 0;
        double C = 0;
        double D = 0;
        double E = 0;
        double F = 0;
        try {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese el valor de A");
            A = teclado.nextDouble();
            System.out.println("Ingrese el valor de B");
            B = teclado.nextDouble();
            System.out.println("Ingrese el valor de C");
            C = teclado.nextDouble();
            System.out.println("Ingrese el valor de D");
            D = teclado.nextDouble();
            System.out.println("Ingrese el valor de E");
            E = teclado.nextDouble();
            System.out.println("Ingrese el valor de F");
            F = teclado.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("ingrese numeros (Si es decimal use comas)");
            System.exit(1);
        }
        double y = CalculoDeY(A, B, C, D, E, F);
        double x = CalculoDeX(A, B, C, D, E, F);


        System.out.println("El valor de X es: " + x);
        System.out.println("El valor de Y es: " + y);
    }

    public static double CalculoDeX(double A, double B, double C, double D, double E, double F) {
        double x;

        if (B == 0 && E == 0) {
            x = ((C + F) / (A + D));
        } else if (A == 0 && D == 0) {
            x = 0;
        } else {
            x = (((C * E) - (B * F)) / ((A * E) - (D * B)));
        }
        return x;
    }

    public static double CalculoDeY(double A, double B, double C, double D, double E, double F) {
        double y;
        if (A == 0 && D == 0) {
            y = ((C + F) / (B + E));
        } else if (B == 0 && E == 0) {
            y = 0;
        } else {
            y = ((A * F) - (D * C)) / ((E * A) - (D * B));
        }
        return y;
    }

}
