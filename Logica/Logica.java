package calculadora;
import java.util.Scanner;
import logica.Logica;
public class Calculadora {
    public static void main(String[] args) {
        Logica metodo = new Logica();
        Scanner V = new Scanner(System.in);
        int opc;

        do {
            System.out.println("Bienvenido Usuario user123"
                    + "\nQue desea hacer?"
                    + "\n[1]Sumar"
                    + "\n[2]Restar"
                    + "\n[3]Multiplicar"
                    + "\n[4]Dividir"
                    + "\n[5]Salir");
            opc = V.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Resultado= " + metodo.Suma());
                    break;
                case 2:
                    System.out.println("Resultado= " + metodo.Resta());
                    break;
                case 3:
                    System.out.println("Resultado= " + metodo.Multiplicacion());
                    break;
                case 4:
                    System.out.println("Resultado= " + metodo.Divicion());
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion erronea");
            }
            System.out.println("");
        } while (opc != 5);

    }

}
