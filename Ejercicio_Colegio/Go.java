package Ejercicio_Colegio;

import Ejercicio_Colegio.Libreria.Functions;
import java.util.Scanner;

public class Go {
    public static Scanner scanner = new Scanner(System.in);
    public static int option;
    public static void main(String[] args) {
        do {

            System.out.println("SISTEMA DE REGISTRO");
            System.out.println("(1) Registrar Nombre del Colegio");
            System.out.println("(2) Registrar Cantidad de Salones");
            System.out.println("(3) Ver Distribucion Salones-Grupos");
            System.out.println("(4) Registrar Estudiantes");
            System.out.println("(5) Filtrar por Salon");
            System.out.println("(6) Filtrar por Grupo");
            System.out.println("(7) Reporte Final");
            System.out.println("(8) Salir");
            System.out.println("según la opcion que elijas...");
            System.out.print("Ingrese un valor numerico entero positivo:");
             option = scanner.nextInt();

           switch (option) {
            case 1:
                Functions.nombreDeColegio();
             break;
            case 2:
                Functions.ingresarSalones();
             break;
            case 3:
                Functions.distribuirGrupos();
             break;
            case 4:
                Functions.registrarEstudiantes();
             break;
            case 5:
                Functions.filtrarPorSalon();
             break;
            case 6:
                Functions.filtrarPorGrupo();
             break;
            case 7:
                Functions.reporteGrupos();
             break;
         default:
                System.out.println("Opción no válida.");
             break;
            
            
        }
        } while (option!=7);
        System.out.println("Has salido del sistema");
    
    }
}
