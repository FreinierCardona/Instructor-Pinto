
import java.util.Arrays;
import java.util.Scanner;

public class Calculadora {
    public static double a, b, c;
    public static Scanner scan = new Scanner(System.in);
    public static int[] arreglo1 = new int[10];
    public static int[] arreglo2 = new int[10];

    public static void main(String[] args) {
        int option;

        System.out.println("SISTEMA DE OPERACION CON ARREGLOS");

      
        System.out.println("ARREGLO NUMERO UNO");
        for (int x = 0; x < 10; x++) {
            System.out.print("Digita un número: ");
            arreglo1[x] = scan.nextInt();
        }
        Arrays.sort(arreglo1);
        mostrarArreglo(arreglo1);

       
        System.out.println("ARREGLO NUMERO DOS");
        for (int y = 0; y < 10; y++) {
            System.out.print("Digita un número: ");
            arreglo2[y] = scan.nextInt();
        }
        Arrays.sort(arreglo2);
        mostrarArreglo(arreglo2);

        do {
            System.out.println("Ingresa la operación que deseas realizar:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            option = scan.nextInt();

            switch (option) {
                case 1:
                    operar("suma");
                    break;
                case 2:
                    operar("resta");
                    break;
                case 3:
                    operar("multiplicacion");
                    break;
                case 4:
                    operar("division");
                    break;
                default:
                    break;
            }
        } while (option < 5);

        scan.close();
    }

    public static void mostrarArreglo(int[] arreglo) {
        System.out.println("LISTA DE VALORES INGRESADOS:");
        for (int num : arreglo) {
            System.out.println(num);
        }
    }

    public static void operar(String operacion) {
        System.out.println("Elige un número del primer arreglo:");
        int indexA = scan.nextInt() - 1;
        a = arreglo1[indexA];

        System.out.println("Elige un número del segundo arreglo:");
        int indexB = scan.nextInt() - 1;
        b = arreglo2[indexB];

        switch (operacion) {
            case "suma":
                c = a + b;
                break;
            case "resta":
                c = a - b;
                break;
            case "multiplicacion":
                c = a * b;
                break;
            case "division":
                if (b != 0) {
                    c = a / b;
                } else {
                    System.out.println("No se puede dividir entre 0.");
                    return;
                }
                break;
        }
        System.out.println("Respuesta: " + c);
    }
}
