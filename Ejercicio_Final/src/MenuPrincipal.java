import java.util.Scanner;

public class MenuPrincipal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // --- INICIO DE REGISTRO SENA ---
        System.out.println("--- BIENVENIDO AL SISTEMA DE REGISTRO SENA ---");
        
        // Nivel 1: Regional
        Regional regional = new Regional();
        System.out.print("\nIngrese el nombre de la Regional: ");
        regional.nombre = scan.nextLine();

        // Nivel 2: Centro
        Centro centro = new Centro();
        System.out.print("Ingrese el nombre del Centro de Formación: ");
        centro.nombre = scan.nextLine();
        regional.agregarCentro(centro); 

        // Nivel 3: Sede
        Sede sede = new Sede();
        System.out.print("Ingrese el nombre de la Sede: ");
        sede.nombre = scan.nextLine();
        centro.agregarSede(sede); 

        System.out.print("\n¿Cuántas líneas de formación tiene la sede '" + sede.nombre + "'? ");
        int cantLineas = scan.nextInt();
        scan.nextLine(); 

        // Bucle para cada LÍNEA DE FORMACIÓN
        for (int i = 0; i < cantLineas; i++) {
            Linea linea = new Linea();
            System.out.println("\n--- Línea de Formación #" + (i + 1) + " ---");
            System.out.print("Nombre de la línea: ");
            linea.nombre = scan.nextLine();
            sede.agregarLinea(linea); 

            System.out.print("¿Cuántos programas tiene la línea '" + linea.nombre + "'? ");
            int cantProgramas = scan.nextInt();
            scan.nextLine(); 

            // Bucle para cada PROGRAMA DE FORMACIÓN
            for (int j = 0; j < cantProgramas; j++) {
                ProgramaFormacion programa = new ProgramaFormacion();
                System.out.println("\n--- Programa de Formación #" + (j + 1) + " ---");
                System.out.print("Nombre del programa: ");
                programa.nombre = scan.nextLine();
                linea.agregarPrograma(programa); 

                System.out.print("¿Cuántos ambientes son para el programa '" + programa.nombre + "'? ");
                int cantAmbientes = scan.nextInt();
                scan.nextLine(); 

                // Bucle para cada AMBIENTE
                for (int k = 0; k < cantAmbientes; k++) {
                    Ambiente ambiente = new Ambiente();
                    System.out.println("\n--- Ambiente #" + (k + 1) + " ---");
                    System.out.print("Código del ambiente: ");
                    ambiente.codigo = scan.nextLine();
                    System.out.print("Descripción: ");
                    ambiente.descripcion = scan.nextLine();
                    programa.agregarAmbiente(ambiente); 
                    
                    int nFichas;
                    do {
                        System.out.print("¿Cuántas fichas se asignarán a este ambiente? (máx. 3): ");
                        nFichas = scan.nextInt();
                        scan.nextLine(); 
                        if (nFichas > 3) {
                            System.out.println(" Error: Un ambiente no puede tener más de 3 fichas. Intente de nuevo.");
                        }
                    } while (nFichas > 3);

                    // Bucle para cada FICHA
                    for (int m = 0; m < nFichas; m++) {
                        Ficha ficha = new Ficha();
                        System.out.println("\n--- Ficha #" + (m + 1) + " ---");
                        System.out.print("Código de la ficha: ");
                        ficha.codigo = scan.nextLine();
                        ambiente.agregarFicha(ficha); 
                        ficha.ambiente = ambiente;    
                        
                        int nAprendices;
                        do {
                            System.out.print("¿Cuántos aprendices tiene la ficha " + ficha.codigo + "? (máx. 30): ");
                            nAprendices = scan.nextInt();
                            scan.nextLine(); 
                            if (nAprendices > 30) {
                                System.out.println(" Error: Una ficha no puede tener más de 30 aprendices. Intente de nuevo.");
                            }
                        } while (nAprendices > 30);

                        // Bucle para cada APRENDIZ
                        for (int n = 0; n < nAprendices; n++) {
                            Aprendiz aprendiz = new Aprendiz();
                            System.out.println("\n--- Aprendiz #" + (n + 1) + " ---");
                            System.out.print("Nombre completo: ");
                            aprendiz.nombre = scan.nextLine();
                            
                            String docAprendiz;
                            boolean docRepetido;
                            do {
                                docRepetido = false;
                                System.out.print("Documento de identidad: ");
                                docAprendiz = scan.nextLine();
                                for (Aprendiz apExistente : ficha.aprendices) {
                                    if (apExistente.documento != null && apExistente.documento.equalsIgnoreCase(docAprendiz)) {
                                        System.out.println(" Error: El documento ya está registrado en esta ficha. Intente de nuevo.");
                                        docRepetido = true;
                                        break;
                                    }
                                }
                            } while (docRepetido);
                            
                            aprendiz.documento = docAprendiz;
                            aprendiz.ficha = ficha;
                            aprendiz.programa = programa;
                            aprendiz.linea = linea;
                            ficha.agregarAprendiz(aprendiz); 
                        }
                    }
                }

                
                System.out.print("\n¿Cuántos instructores tiene el programa '" + programa.nombre + "'? ");
                int nInstructores = scan.nextInt();
                scan.nextLine(); 

                for (int q = 0; q < nInstructores; q++) {
                    Instructor instructor = new Instructor();
                    System.out.println("\n--- Instructor #" + (q + 1) + " ---");
                    System.out.print("Nombre completo: ");
                    instructor.nombre = scan.nextLine();

                    String docInstructor;
                    boolean docRepetido;
                    do {
                        docRepetido = false;
                        System.out.print("Documento de identidad: ");
                        docInstructor = scan.nextLine();
                        for (Instructor insExistente : programa.instructores) {
                            if (insExistente.documento != null && insExistente.documento.equalsIgnoreCase(docInstructor)) {
                                System.out.println(" Error: El documento ya está registrado para este programa. Intente de nuevo.");
                                docRepetido = true;
                                break;
                            }
                        }
                    } while (docRepetido);
                    
                    instructor.documento = docInstructor;
                    instructor.linea = linea;
                    programa.agregarInstructor(instructor);
                }
            }
        }
        
        // ---  GENERACIÓN DE HORARIOS ---
        System.out.println("\n--- GENERANDO HORARIOS ---");
        generarHorarios(regional);
        
        System.out.println("\n ¡REGISTRO Y HORARIOS COMPLETADOS!");
        
        // ---  MENÚ DE REPORTES ---
        int opcion;
        do {
            System.out.println("\n--- MENÚ DE REPORTES ---");
            System.out.println("1. Reporte de Instructores");
            System.out.println("2. Reporte de Aprendices");
            System.out.println("3. Reporte de Ambientes y Horarios");
            System.out.println("0. Salir del programa");
            System.out.print("Seleccione una opción: ");
            opcion = scan.nextInt();
            scan.nextLine(); // FIX: Consumir el salto de línea

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

        scan.close();
    }
    
   
    public static void generarHorarios(Regional regional) {
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};
        String[] horas = {"08:00", "10:00", "12:00", "14:00", "16:00"};
        
        for (Centro centro : regional.centros) {
            for (Sede sede : centro.sedes) {
                for (Linea linea : sede.lineas) {
                    for (ProgramaFormacion programa : linea.programas) {
                        for (Ambiente ambiente : programa.ambientes) {
                            for (Ficha ficha : ambiente.fichas) {
                                Instructor instructorAsignado = programa.instructores.isEmpty() ? null : programa.instructores.get(0);

                                if (instructorAsignado != null) {
                                    String dia = dias[((int)(Math.random() * dias.length))];
                                    String horaInicio = horas[((int)(Math.random() * horas.length))];
                                    String horaFin = "18:00"; 
                                    
                                    Actividad nuevaActividad = new Actividad(ficha, ambiente, instructorAsignado, dia, horaInicio, horaFin);
                                    
                                    ficha.horario.add(nuevaActividad);
                                    instructorAsignado.horario.add(nuevaActividad);
                                    ambiente.horario.add(nuevaActividad);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}