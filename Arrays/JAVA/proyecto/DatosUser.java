
import java.util.Scanner;

public class DatosUser {
    public static Scanner scanner = new Scanner(System.in);
    public static String a,b,c,d,e,f;
  

    public static void main(String[] args) {
    
    System.out.println("CONTACTOS DE USUARIO");

    System.out.print("Ingrese la cantidad de usuarios a registrar: ");
    int x=scanner.nextInt();
    scanner.nextLine();

    String[] nombre = new String[x];
    String[] celular = new String[x];
    String[] direccion = new String[x];
    String[] ocupacion = new String[x];
    String[] correo = new String[x];
    String[] RH = new String[x];
       
          
        for(int i = 0; i < x; i++){
        System.out.println("");
        System.out.println("USUARIO "+(i+1)+"");
            
        System.out.println("Nombre: ");
        nombre[i] = scanner.nextLine();
       

        System.out.println("Celular: ");
        celular[i]=scanner.nextLine();
      

        System.out.println("Direccion: ");
        direccion[i]=scanner.nextLine();
       

        System.out.println("Ocupacion: ");
        ocupacion[i]=scanner.nextLine();
       
        
        System.out.println("Correo: ");
        correo[i]=scanner.nextLine();
     

        System.out.println("RH: ");
        RH[i]=scanner.nextLine();
     
        }
      
        System.out.println("");
        System.out.println("LISTA DE USUARIOS");
        for(int i=0; i<x;i++){
            System.out.println("------------------------------------------");
            System.out.println("Nombre: "+nombre[i]);
            System.out.println("Celular: "+celular[i]);
            System.out.println("Direccion: "+direccion[i]);
            System.out.println("Ocupacion: "+ocupacion[i]);
            System.out.println("Correo: "+correo[i]);
            System.out.println("RH: "+RH[i]);
            System.out.println("------------------------------------------");
            System.out.println("");
        }

        System.out.println("");
        System.out.println("BUSQUEDA DE USUARIOS");

        
        System.out.println("");
        System.out.print("Ingrese el dato (nombre, teléfono, email, etc.) para buscar a la persona: ");
        String caracteristica=scanner.nextLine().toLowerCase();

        boolean encontrado = false;
        for(int i = 0; i < x; i++){
            if (nombre[i].toLowerCase().contains(caracteristica) || ocupacion[i].toLowerCase().contains(caracteristica) ||
               celular[i].toLowerCase().contains(caracteristica) || correo[i].toLowerCase().contains(caracteristica) ||
               RH[i].toLowerCase().contains(caracteristica) || direccion[i].toLowerCase().contains(caracteristica)) {

                System.out.println("");
                System.out.println("USUARIO ENCONTRADO:");
                   System.out.println("");

                System.out.println("Nombre: "+ nombre[i]);
                System.out.println("Ocupacion: "+ ocupacion[i]);
                System.out.println("Telefono: "+ celular[i]);
                System.out.println("Email: "+ correo[i]);
                System.out.println("RH: "+ RH[i]);
                System.out.println("Direccion: " + direccion[i]);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró ninguna persona vinculada al dato ingresado.");
        }

    }

    }
