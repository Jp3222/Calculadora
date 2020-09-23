package logica;

import java.util.Scanner;

public class Logica {

    Scanner V = new Scanner(System.in);
    private double A, B;

    public double Suma() {
        System.out.println("");
        double C = 0;
        System.out.println("Metodo Sumar"
                + "\nIntroduce El numero 1: ");
        A = V.nextInt();
        System.out.println("Introduce el numero 2: ");
        B = V.nextInt();
        C = A + B;
        return C;
    }

    public double Resta() {
        System.out.println("");
        double C = 0;
        System.out.println("Metodo Restar"
                + "\nIntroduce El numero 1: ");
        A = V.nextInt();
        System.out.println("Introduce el numero 2: ");
        B = V.nextInt();
        C = A - B;
        return C;
    }

    public double Multiplicacion() {
        System.out.println("");
        double C = 0;
        System.out.println("Metodo Sumar"
                + "\nIntroduce El numero 1: ");
        A = V.nextInt();
        System.out.println("Introduce el numero 2: ");
        B = V.nextInt();
        C = A * B;
        return C;
    }

    public double Divicion() {
        System.out.println("");
        double C = 0;
        try {
            System.out.println("Metodo Sumar"
                    + "\nIntroduce El Dividendo: ");
            A = V.nextInt();
            System.out.println("Introduce el Divisor: ");
            B = V.nextInt();
            C = A / B;
        } catch (Exception e) {
            System.out.println(e.getCause());
        }
        return C;
    }
}
