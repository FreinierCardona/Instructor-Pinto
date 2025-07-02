import  java.util.Scanner;
 public class App {
    public static int option;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("SISTEMA DE EMERGENCIAS");
            System.out.println("1. Registrar conductores");
            System.out.println("2. Registrar pacientes");
            System.out.println("3. Registrar ambulancias");
            System.out.println("4. Registrar muertos");
            System.out.println("5. Listar conductores");
            System.out.println("6. Listar pacientes");
            System.out.println("7. Listar muertos");
            System.out.println("8. Asignar conductor-ambulancia");
            System.out.println("9. Recoger pacientes");
            System.out.println("10. Reporte final");
            System.out.println("11. Solicitud de ambulancias por clínicas");
            System.out.println("12. Recoger muertos con carro fúnebre");
            System.out.println("13. Listar muertos no recogidos");
            System.out.println("14. Reporte de distancias recorridas");
            System.out.println("15. Reporte de cantidad de recorridos");
            System.out.println("16. Salir");
            System.out.print("Ingrese la opción que desea ejecutar: ");
            option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1 -> Datos.registrarConductor();
                case 2 -> Datos.registrarPacientes();
                case 3 -> Datos.registrarAmbulancia();
                case 4 -> Datos.registrarMuertos();
                case 5 -> Datos.listConductor();
                case 6 -> Datos.listPacientes();
                case 7 -> Datos.listMuertos();
                case 8 -> Datos.asignarCarro();
                case 9 -> Datos.recogerPaciente();
                case 10 -> Datos.reporteFinal();
                case 11 -> Datos.solicitudAmbulanciasClinicas();
                case 12 -> Datos.recogerMuertos();
                case 13 -> Datos.listarMuertosNoRecogidos();
                case 14 -> Datos.reporteDistancias();
                case 15 -> Datos.reporteRecorridos();
                case 16 -> System.out.println("Has salido del Sistema, ¡GRACIAS!");
                default -> System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (option != 16);

        scanner.close();
    }
}
