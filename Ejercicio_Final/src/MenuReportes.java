import java.util.Scanner;

public class MenuReportes {

    public void mostrarMenu(Regional regional, Scanner scan) {
        int opcion;
        do {
            System.out.println("\n--- MENÚ DE REPORTES ---");
            System.out.println("1. Reporte de Instructores");
            System.out.println("2. Reporte de Aprendices");
            System.out.println("3. Reporte de Ambientes y Horarios");
            System.out.println("0. Salir del programa");
            System.out.print("Seleccione una opción: ");
            opcion = scan.nextInt();
            scan.nextLine(); 

            switch (opcion) {
                case 1:
                    Reportes.reportarInstructores(regional, scan);
                    break;
                case 2:
                    Reportes.reportarAprendices(regional);
                    break;
                case 3:
                    Reportes.reportarAmbientesYHorarios(regional);
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta pronto!");
                    break;
                default:
                    System.out.println(" Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 0);
    }
}