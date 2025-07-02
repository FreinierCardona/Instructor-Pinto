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
public static String[] clinicas = {"Clinica 1", "Clinica 2", "Clinica 3"};
public static int[] pacientesPorClinica = {34, 33, 33};
public static int[] distanciaPorClinica = {55, 35, 45};
public static int[] recorridosAmbulancia = new int[10];
public static int[] distanciaAmbulancia = new int[10];
public static int recorridosFunebre = 0;
public static int distanciaFunebre = 0;
public static HashSet<String> muertosNoRecogidos = new HashSet<>();
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

public static void solicitudAmbulanciasClinicas() {
    System.out.println("SOLICITUDES DE AMBULANCIAS POR CLÍNICAS:");
    for (int i = 0; i < clinicas.length; i++) {
        System.out.println(clinicas[i] + " solicitó ambulancia para " + pacientesPorClinica[i] + " pacientes.");
        System.out.println("Distancia a recorrer: " + distanciaPorClinica[i] + " km");

        int ambulanciaIndex = i % ambulancia.length;
        int conductorIndex = i % conductor.length;

        if (recorridosAmbulancia[ambulanciaIndex] >= 8 || 
            distanciaAmbulancia[ambulanciaIndex] + distanciaPorClinica[i] > 400) {
            System.out.println("No se puede enviar la ambulancia " + ambulancia[ambulanciaIndex][0] + ": Límite excedido.");
            continue;
        }


        recorridosAmbulancia[ambulanciaIndex]++;
        distanciaAmbulancia[ambulanciaIndex] += distanciaPorClinica[i];

        System.out.println("Ambulancia " + ambulancia[ambulanciaIndex][0] + " enviada con conductor " + conductor[conductorIndex][0]);
        System.out.println("------------------------------------------");
    }
}

public static void recogerMuertos() {
    System.out.println("RECOGER MUERTOS CON CARRO FÚNEBRE:");
    int conductorIndex = random.nextInt(conductor.length);
    for (String muerto : muertos) {
        if (muerto == null || muerto.isEmpty()) continue;

        int distancia = random.nextInt(50) + 10; // distancia simulada
        if (recorridosFunebre >= 8 || distanciaFunebre + distancia > 400) {
            muertosNoRecogidos.add(muerto);
            continue;
        }

        System.out.println("Muerto: " + muerto + " fue recogido por el carro fúnebre");
        System.out.println(" - Conductor: " + conductor[conductorIndex][0] + " " + conductor[conductorIndex][1]);
        System.out.println(" - Distancia: " + distancia + " km");

        distanciaFunebre += distancia;
        recorridosFunebre++;
        System.out.println("--------------------------------------");
    }
}

public static void listarMuertosNoRecogidos() {
    System.out.println("MUERTOS NO RECOGIDOS:");
    if (muertosNoRecogidos.isEmpty()) {
        System.out.println("Todos fueron recogidos.");
    } else {
        for (String muerto : muertosNoRecogidos) {
            System.out.println( muerto);
        }
    }
}


public static void reporteDistancias() {
    System.out.println("DISTANCIA RECORRIDA POR VEHÍCULOS:");
    for (int i = 0; i < ambulancia.length; i++) {
        if (ambulancia[i][0] != null) {
            System.out.println("Ambulancia " + ambulancia[i][0] + " recorrió " + distanciaAmbulancia[i] + " km");
        }
    }
    System.out.println("Carro Fúnebre recorrió " + distanciaFunebre + " km");
}


public static void reporteRecorridos() {
    System.out.println("CANTIDAD DE RECORRIDOS:");
    for (int i = 0; i < ambulancia.length; i++) {
        if (ambulancia[i][0] != null) {
            System.out.println("Ambulancia " + ambulancia[i][0] + " hizo " + recorridosAmbulancia[i] + " recorridos");
        }
    }
    System.out.println("Carro Fúnebre hizo " + recorridosFunebre + " recorridos");
}

}


