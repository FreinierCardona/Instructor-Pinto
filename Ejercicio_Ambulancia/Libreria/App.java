import  java.util.Scanner;
 public class App {
 public static int  option;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        do{
            System.out.println("SISTEMA DE EMERGENCIAS");
            System.out.println("1. registrar conductores ");
            System.out.println("2. registrar pacientes");
            System.out.println("3. registrar ambulancias ");
            System.out.println("4. registrar muertos ");
            System.out.println("5. listar conductores ");
            System.out.println("6. listar pacientes");
            System.out.println("7. listar muertos ");
            System.out.println("8. asignar conductor-ambulancia ");
            System.out.println("9. recoger pacientes ");
            System.out.println("10. reporte final");
            System.out.println("11. salir");
            System.out.println("Ingrese la opcion que desea ejecutar: ");
            option = scanner.nextInt();

            switch (option) {
            case 1:{
                Datos.registrarConductor();
            }
                
                break;
            case 2:{
                Datos.registrarPacientes();
            }
                
                break;
            case 3:{
                Datos.registrarAmbulancia();
            }
                
                break;
            case 4:{
                Datos.registrarMuertos();
            }
                
                break;
            case 5:{
                Datos.listConductor();
            }
                
                break;
            case 6:{
                Datos.listPacientes();
            }
                
                break;
            case 7:{
                Datos.listMuertos();
            }
                
                break;
            case 8:{
                Datos.asignarCarro();
            }
                
                break;
            case 9:{
                Datos.recogerPaciente();
            }
                
                break;
            case 10:{
                Datos.reporteFinal();
            }
                
                break;
        
            default:
                break;
        }
        }while(option!=11);

        
        System.out.println("Has salido del Sistema, GRACIAS!!!!");
        scanner.close();
    }
 }