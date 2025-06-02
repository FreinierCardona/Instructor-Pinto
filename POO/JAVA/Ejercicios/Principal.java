import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("EJERCICIOS COMPLETOS");
        
        System.out.println("Ingrese un Numero Entero dentro del rango 1-30: ");
        int option= scanner.nextInt();
        
        switch (option) {
            case 1:{
                Datos.E1();
            }
                
                break;
            case 2:{
                Datos.E2();
            }
                
                break;
            case 3:{
                Datos.E3();
            }
                
                break;
            case 4:{
                Datos.E4();
            }
                
                break;
            case 5:{
                Datos.E5();
            }
                
                break;
            case 6:{
                Datos.E6();
            }
                
                break;
            case 7:{
                Datos.E7();
            }
                
                break;
            case 8:{
                Datos.E8();
            }
                
                break;
            case 9:{
                Datos.E9();
            }
                
                break;
            case 10:{
                Datos.E10();
            }
                
                break;
            case 11:{
                Datos.E11();
            }
                
                break;
            case 12:{
                Datos.E12();
            }
                
                break;
            case 13:{
                Datos.E13();
            }
                
                break;
            case 14:{
                Datos.E14();
            }
                
                break;
            case 15:{
                Datos.E15();
            }
                
                break;
            case 16:{
                Datos.E16();
            }
                
                break;
            case 17:{
                Datos.E17();
            }
                
                break;
            case 18:{
                Datos.E18();
            }
                
                break;
            case 19:{
                Datos.E19();
            }
                
                break;
            case 20:{
                Datos.E20();
            }
                
                break;
            case 21:{
                Datos.E21();
            }
                
                break;
            case 22:{
                Datos.E22();
            }
                
                break;
            case 23:{
                Datos.E23();
            }
                
                break;
            case 24:{
                Datos.E24();
            
            }
                
                break;
            case 25:{
                Datos.E25();
            }
                
                break;
            case 26:{
                Datos.E26();
            }
                
                break;
            case 27:{
                Datos.E27();
            }
                
                break;
            case 28:{
                Datos.E28();
            }
                
                break;
            case 29:{
                Datos.E29();
            }
                
                break;
            case 30:{
                Datos.E30();
            }
                
                break;
        
            default:
            System.out.println("Numero Ingresado NO VALIDO");
                break;
        }
    scanner.close();
    }
}