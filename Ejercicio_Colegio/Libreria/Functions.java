package Ejercicio_Colegio.Libreria;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Functions {


    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static String nombreColegio;
    public static int cantidadSalones;
    public static final int MAX_ESTUDIANTES = 25;

    public static ArrayList<String> salones = new ArrayList<>();
    public static ArrayList<String> grupos = new ArrayList<>();
    public static ArrayList<ArrayList<String>> estudiantesPorSalon = new ArrayList<>();


    public static void nombreDeColegio() {
        System.out.println("----------------------------------");
        System.out.print("Ingrese el nombre del colegio: ");
        nombreColegio = scanner.nextLine();
        System.out.println("Colegio registrado: " + nombreColegio);
    }

    public static void ingresarSalones() {
        System.out.println("----------------------------------");
        System.out.print("Ingrese la cantidad de salones: ");
        cantidadSalones = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < cantidadSalones; i++) {
            salones.add("Salón " + (i + 1));
            estudiantesPorSalon.add(new ArrayList<>());
        }
    }

    public static void distribuirGrupos() {
        System.out.println("----------------------------------");
        String[] grados = {"6A", "6B", "7A", "7B", "8A", "8B", "9A", "9B", "10A", "10B", "11A", "11B"};
        for (int i = 0; i < cantidadSalones; i++) {
            String grupoAsignado = grados[random.nextInt(grados.length)];
            while (grupos.contains(grupoAsignado)) {
                grupoAsignado = grados[random.nextInt(grados.length)];
            }
            grupos.add(grupoAsignado);
        }
        System.out.println("GRUPOS ASIGNADOS:");
        for (String grupo : grupos) {
        System.out.println(grupo);
        }
       
    }

    public static void registrarEstudiantes() {
        System.out.println("----------------------------------");
        for (int i = 0; i < cantidadSalones; i++) {
            System.out.println("Registrando estudiantes para " + salones.get(i) + " - Grupo " + grupos.get(i));
            for (int j = 0; j < MAX_ESTUDIANTES; j++) {
                System.out.print("Ingrese nombre del estudiante #" + (j + 1) + " (o escriba 'fin' para parar): ");
                String nombre = scanner.nextLine();
                if (nombre.equalsIgnoreCase("fin")) {
                    break;
                }
                estudiantesPorSalon.get(i).add(nombre);
            }
        }
    }


    public static void filtrarPorSalon() {
        System.out.println("----------------------------------");
        System.out.print("Ingrese número de salón (1 a " + cantidadSalones + "): ");
        int num = scanner.nextInt();
        scanner.nextLine();

        if (num >= 1 && num <= cantidadSalones) {
            int index = num - 1;
            System.out.println("\nEstudiantes del " + salones.get(index) + " - Grupo " + grupos.get(index));
            for (String est : estudiantesPorSalon.get(index)) {
                System.out.println("- " + est);
            }
        } else {
            System.out.println("Número de salón inválido.");
        }
    }

    public static void filtrarPorGrupo() {
        System.out.println("----------------------------------");
        System.out.print("Ingrese nombre del grupo (ej: 6A): ");
        String grupoBuscado = scanner.nextLine();

        int index = grupos.indexOf(grupoBuscado);
        if (index != -1) {
            System.out.println("\nEstudiantes del grupo " + grupoBuscado + " en " + salones.get(index));
            for (String est : estudiantesPorSalon.get(index)) {
                System.out.println("- " + est);
            }
        } else {
            System.out.println("Grupo no encontrado.");
        }
    }

    public static void reporteGrupos() {
        System.out.println("----------------------------------");
        System.out.println("REPORTE DE GRUPOS - " + nombreColegio );
        for (int i = 0; i < cantidadSalones; i++) {
            System.out.println(salones.get(i) + " → Grupo: " + grupos.get(i) + " | Estudiantes: " + estudiantesPorSalon.get(i).size());
        }
    }
}