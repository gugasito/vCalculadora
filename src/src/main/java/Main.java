import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        solucionSistemaEcuaciones();
    }

    public static void solucionSistemaEcuaciones() {
        double A=0;
        double B=0;
        double C=0;
        double D=0;
        double E=0;
        double F=0;
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
        double y =CalculoDeY(A,B,C,D,E,F);
        double x =CalculoDeX(A,B,C,D,E,F);


        System.out.println("El valor de X es: " + x);
        System.out.println("El valor de Y es: " + y);
    }

    public static double CalculoDeX(double A, double B, double C, double D, double E, double F) {
        double x;

        if (B==0&&E==0){
            x=((C+F)/(A+D));
        }else if (A==0&&D==0){
            x=0;
        }else {
            x=(((C*E)-(B*F))/((A*E)-(D*B)));
        }
        return x;
    }

    public static double CalculoDeY(double A, double B, double C, double D, double E, double F) {
        double y;
        if (A==0 && D==0) {
            y = ((C + F) / (B + E));
        }else if(B==0&&E==0){
            y=0;
        }
        else {
            y = ((A * F) - (D * C)) / ((E * A) - (D * B));
        }
        return y;
    }

}
