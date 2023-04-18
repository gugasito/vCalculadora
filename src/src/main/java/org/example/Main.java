package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        solucionSistemaEcuaciones();
    }

    public static void solucionSistemaEcuaciones() {
        float A=0;
        float B=0;
        float C=0;
        float D=0;
        float E=0;
        float F=0;
        try {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese el valor de A");
            A = teclado.nextFloat();
            System.out.println("Ingrese el valor de B");
            B = teclado.nextFloat();
            System.out.println("Ingrese el valor de C");
            C = teclado.nextFloat();
            System.out.println("Ingrese el valor de D");
            D = teclado.nextFloat();
            System.out.println("Ingrese el valor de E");
            E = teclado.nextFloat();
            System.out.println("Ingrese el valor de F");
            F = teclado.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("ingrese numeros (Si es decimal use comas)");
            System.exit(1);
        }
        float y =CalculoDeY(A,B,C,D,E,F);
        float x =CalculoDeX(A,B,C,D,E,F);


        System.out.println("El valor de X es: " + x);
        System.out.println("El valor de Y es: " + y);
    }

    private static float CalculoDeX(float A, float B, float C, float D, float E, float F) {
        float x;

        if (B==0&&E==0){
            x=((C+F)/(A+D));
        }else if (A==0&&D==0){
            x=0;
        }else {
            x=(((C*E)-(B*F))/((A*E)-(D*B)));
        }
        return x;
    }

    private static float CalculoDeY(float A, float B, float C, float D, float E, float F) {
        float y;
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
