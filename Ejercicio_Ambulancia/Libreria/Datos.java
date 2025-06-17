import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
public class Datos {

public static Scanner scanner = new Scanner (System.in);

public static String[][] pacientes = new String[10][10];
public static String[][] conductor = new String[10][3];
public static String[][] ambulancia = new String[10][2]; 
public static String[] muertos = new String[15];
public static String[] funebre = {"Carro Funebre"};
public static String[] asignacionCA= new String[10];
public static Random random = new Random();


public static void registrarConductor(){

  System.out.println("REGISTRAR CONDUCTORES:");

        for (int i = 0; i < conductor.length; i++) {
            System.out.println("");
            System.out.println("CONDUCTOR " + (i + 1) + ":");
        
            System.out.print("Nombre: ");
            conductor[i][0] = scanner.nextLine();

            System.out.print("Apellido: ");
            conductor[i][1] = scanner.nextLine();

            System.out.print("Teléfono: ");
            conductor[i][2] = scanner.nextLine();

            System.out.println("--------------------------------------");
        }

}

public static void registrarPacientes(){
    System.out.println("REGISTRAR PACIENTES:");

        for (int i = 0; i < pacientes.length; i++) {

            for(int x=0; x< pacientes.length; x++ ){
                int numeroPaciente = i * 10 + x + 1;
                System.out.println("");

                System.out.println("PACIENTE " + numeroPaciente + ":");
            
                System.out.print("Nombre Completo: ");
                pacientes[i][x] = scanner.nextLine();
                

                System.out.println("--------------------------------------");
            }
            
        }

}
public static void registrarAmbulancia() {

    System.out.println("");
    System.out.println("REGISTRAR AMBULANCIA:");

        for (int i = 0; i < ambulancia.length; i++) { 
            int numeroAmbulancia = i + 1; 
            System.out.println("AMBULANCIA " + numeroAmbulancia + ":");

            System.out.print("Nombre Ambulancia: ");
            ambulancia[i][0] = scanner.nextLine(); 

            System.out.print("Numero de Placa: ");
            ambulancia[i][1] = scanner.nextLine(); 

        System.out.println("-------------------------------------------");
    }
}

public static void registrarMuertos(){
    System.out.println("");

    System.out.println("REGISTRAR MUERTOS");

        for(int i = 0; i < muertos.length; i++){
            System.out.println("Nombre del Muerto: ");
            muertos[i]=scanner.nextLine();

            System.out.println("-----------------------------------------");
        }

}
public static void listConductor(){

    System.out.println("LISTADO DE CONDUCTORES:");
        for (int i = 0; i < conductor.length; i++) {
            System.out.println("CONDUCTOR " + (i + 1) + 
                                ": Nombre: " + conductor[i][0] + 
                               " | Apellido: " + conductor[i][1] + 
                               " | Teléfono: " + conductor[i][2]);
        }
}

public static void listPacientes(){

    System.out.println("LISTADO DE PACIENTES: ");

    for(int i=0; i < pacientes.length; i++){
        for(int x=0; x < pacientes[i].length; x++){
            int numeroPaciente = i * pacientes[i].length + x + 1;
            System.out.println("PACIENTE: "+numeroPaciente+
                                ": Nombre: "+pacientes[i][x]
                                );
            System.out.println("--------------------------------------");

        }
    }

}
public static void listMuertos(){

System.out.println("");
System.out.println("LISTADO DE MUERTOS");
    for(int i=0; i<muertos.length;i++){
        System.out.println("MUERTO: "+(i+1)+
                           ": | Nombre: "+muertos[i] );
        System.out.println("---------------------------------------------");
    }

}
public static void asignarCarro() {
    HashSet<Integer> conductoresAsignados = new HashSet<>();
    HashSet<Integer> ambulanciasAsignadas = new HashSet<>();

    while (conductoresAsignados.size() < conductor.length && ambulanciasAsignadas.size() < ambulancia.length) {
        int conductorIndex;

        do {
            conductorIndex = random.nextInt(conductor.length);
        } 
        
        while (conductoresAsignados.contains(conductorIndex));
        conductoresAsignados.add(conductorIndex);

        String conductorNombre = conductor[conductorIndex][0];
        String conductorApellido = conductor[conductorIndex][1];
        String conductorTelefono = conductor[conductorIndex][2];

        int ambulanciaIndex;
        do {
            ambulanciaIndex = random.nextInt(ambulancia.length);
        } 
        
        while (ambulanciasAsignadas.contains(ambulanciaIndex));
        ambulanciasAsignadas.add(ambulanciaIndex);

        String ambulanciaNombre = ambulancia[ambulanciaIndex][0];
        String ambulanciaPlaca = ambulancia[ambulanciaIndex][1];


        System.out.println("ASIGNACIÓN CONDUCTOR-AMBULANCIA:");
        System.out.println("Conductor Asignado:");
        System.out.println(" - Nombre: " + conductorNombre);
        System.out.println(" - Apellido: " + conductorApellido);
        System.out.println(" - Teléfono: " + conductorTelefono);
        System.out.println("Ambulancia Asignada:");
        System.out.println(" - Nombre: " + ambulanciaNombre);
        System.out.println(" - Número de Placa: " + ambulanciaPlaca);
        System.out.println("--------------------------------------");
    }
}
public static void recogerPaciente() {
    System.out.println("");
    System.out.println("RECOGER PACIENTES:");

    for (int i = 0; i < pacientes.length; i++) {
        for (int j = 0; j < pacientes[i].length; j++) {
            int pacienteNumero = i * pacientes[i].length + j + 1;
            
            if (pacientes[i][j] != null && !pacientes[i][j].isEmpty()) {
                int ambulanciaIndex = random.nextInt(ambulancia.length);
                int conductorIndex = random.nextInt(conductor.length);

                String pacienteNombre = pacientes[i][j];
                String ambulanciaNombre = ambulancia[ambulanciaIndex][0];
                String ambulanciaPlaca = ambulancia[ambulanciaIndex][1];
                String conductorNombre = conductor[conductorIndex][0];
                String conductorApellido = conductor[conductorIndex][1];
                String conductorTelefono = conductor[conductorIndex][2];

                System.out.println("PACIENTE " + pacienteNumero + ":");
                System.out.println(" - Nombre: " + pacienteNombre);
                System.out.println("Ambulancia Asignada:");
                System.out.println(" - Nombre: " + ambulanciaNombre);
                System.out.println(" - Placa: " + ambulanciaPlaca);
                System.out.println("Conductor Asignado:");
                System.out.println(" - Nombre: " + conductorNombre + " " + conductorApellido);
                System.out.println(" - Teléfono: " + conductorTelefono);
                System.out.println("--------------------------------------");
            }
        }
    }
}

public static void reporteFinal() {
    System.out.println("");
    System.out.println("REPORTE FINAL:");

    System.out.println("Asignaciones de Conductores y Ambulancias:");
    for (int i = 0; i < asignacionCA.length; i++) {
        if (asignacionCA[i] != null) {
            System.out.println(asignacionCA[i]);
        }
    }

    System.out.println("");
    System.out.println("Pacientes Recogidos:");
    for (int i = 0; i < pacientes.length; i++) {
        for (int j = 0; j < pacientes[i].length; j++) {
            if (pacientes[i][j] != null && !pacientes[i][j].isEmpty()) {
                System.out.println("Paciente " + (i * pacientes[i].length + j + 1) + ": " + pacientes[i][j]);
            }
        }
    }

    System.out.println("");

    System.out.println("");
    System.out.println("Conductor Asignado al Carro Fúnebre:");
    if (funebre[0] != null) {
        int conductorIndex = random.nextInt(conductor.length);
        String conductorNombre = conductor[conductorIndex][0];
        String conductorApellido = conductor[conductorIndex][1];
        String conductorTelefono = conductor[conductorIndex][2];

        System.out.println(" - Nombre: " + conductorNombre + " " + conductorApellido);
        System.out.println(" - Teléfono: " + conductorTelefono);
        System.out.println(" - Vehículo: " + funebre[0]);
    }

    System.out.println("--------------------------------------");
}
}


