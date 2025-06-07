
import java.util.Scanner;

public class Arreglos {
    public static Scanner scanner = new Scanner (System.in);
    public static String a,b,c,d;
    public static String[] nombre = new String[1];
    public static String[] segundoNombre = new String[1];
    public static String[] apellido = new String[1];
    public static String[] segundoApellido = new String[1];

    public static void main(String[] args) {
        
        System.out.println("SISTEMA DE USUARIOS");
        System.out.println("Ingrese el Nombre: ");
        nombre[0]=scanner.nextLine();
        a=nombre[0];

        System.out.println("Ingrese el Segundo Nombre: ");
        segundoNombre[0]=scanner.nextLine();
        b=segundoNombre[0];

        System.out.println("Ingrese el Apellido: ");
        apellido[0]=scanner.nextLine();
        c=apellido[0];

        System.out.println("Ingrese el Segundo apellido: ");
        segundoApellido[0]=scanner.nextLine();
        d=segundoApellido[0];

        System.out.println(a+" "+b+" "+c+" "+d);
    }
}