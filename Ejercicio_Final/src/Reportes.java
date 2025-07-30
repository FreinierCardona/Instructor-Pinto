import java.util.Scanner;

public class Reportes {

    public static void reportarInstructores(Regional regional, Scanner scan) {
    System.out.println("\n--- REPORTE DE INSTRUCTORES ---");

    // Reporte por totalidad
    System.out.println("\n1. Totalidad de Instructores de la Regional: " + regional.nombre);
    int totalInstructores = 0;
    for (Centro centro : regional.centros) {
        for (Sede sede : centro.sedes) {
            for (Linea linea : sede.lineas) {
                for (ProgramaFormacion programa : linea.programas) {
                    for (Instructor instructor : programa.instructores) {
                        System.out.println("   - Nombre: " + instructor.nombre + ", Documento: " + instructor.documento + ", Línea: " + linea.nombre);
                        totalInstructores++;
                    }
                }
            }
        }
    }
    System.out.println("   >>> Total de instructores registrados: " + totalInstructores);

    // Reporte por línea de formación
    System.out.println("\n2. Instructores por Línea de Formación");
    for (Centro centro : regional.centros) {
        for (Sede sede : centro.sedes) {
            for (Linea linea : sede.lineas) {
                System.out.println("   - Línea: " + linea.nombre);
                int instructoresPorLinea = 0;
                for (ProgramaFormacion programa : linea.programas) {
                    for (Instructor instructor : programa.instructores) {
                        System.out.println("     -> " + instructor.nombre + " (" + instructor.documento + ")");
                        instructoresPorLinea++;
                    }
                }
                System.out.println("     >>> Cantidad en la línea: " + instructoresPorLinea);
            }
        }
    }

    // Reporte por programa de formación
    System.out.println("\n3. Instructores por Programa de Formación");
    for (Centro centro : regional.centros) {
        for (Sede sede : centro.sedes) {
            for (Linea linea : sede.lineas) {
                for (ProgramaFormacion programa : linea.programas) {
                    System.out.println("   - Programa: " + programa.nombre);
                    int instructoresPorPrograma = 0;
                    for (Instructor instructor : programa.instructores) {
                        System.out.println("     -> " + instructor.nombre + " (" + instructor.documento + ")");
                        instructoresPorPrograma++;
                    }
                    System.out.println("     >>> Cantidad en el programa: " + instructoresPorPrograma);
                }
            }
        }
    }
}
public static void reportarAprendices(Regional regional) {
    System.out.println("\n--- REPORTE DE APRENDICES ---");

    // Reporte por totalidad
    System.out.println("\n1. Totalidad de Aprendices de la Regional: " + regional.nombre);
    int totalAprendices = 0;
    for (Centro centro : regional.centros) {
        for (Sede sede : centro.sedes) {
            for (Linea linea : sede.lineas) {
                for (ProgramaFormacion programa : linea.programas) {
                    for (Ambiente ambiente : programa.ambientes) {
                        for (Ficha ficha : ambiente.fichas) {
                            for (Aprendiz aprendiz : ficha.aprendices) {
                                System.out.println("   - Nombre: " + aprendiz.nombre + ", Documento: " + aprendiz.documento + ", Ficha: " + ficha.codigo);
                                totalAprendices++;
                            }
                        }
                    }
                }
            }
        }
    }
    System.out.println("   >>> Total de aprendices registrados: " + totalAprendices);

    // Reporte por línea de formación
    System.out.println("\n2. Aprendices por Línea de Formación");
    for (Centro centro : regional.centros) {
        for (Sede sede : centro.sedes) {
            for (Linea linea : sede.lineas) {
                System.out.println("   - Línea: " + linea.nombre);
                int aprendicesPorLinea = 0;
                for (ProgramaFormacion programa : linea.programas) {
                    for (Ambiente ambiente : programa.ambientes) {
                        for (Ficha ficha : ambiente.fichas) {
                            for (Aprendiz aprendiz : ficha.aprendices) {
                                System.out.println("     -> " + aprendiz.nombre + " (" + aprendiz.documento + ") - Ficha: " + ficha.codigo);
                                aprendicesPorLinea++;
                            }
                        }
                    }
                }
                System.out.println("     >>> Cantidad en la línea: " + aprendicesPorLinea);
            }
        }
    }

    // Reporte por programa de formación
    System.out.println("\n3. Aprendices por Programa de Formación");
    for (Centro centro : regional.centros) {
        for (Sede sede : centro.sedes) {
            for (Linea linea : sede.lineas) {
                for (ProgramaFormacion programa : linea.programas) {
                    System.out.println("   - Programa: " + programa.nombre);
                    int aprendicesPorPrograma = 0;
                    for (Ambiente ambiente : programa.ambientes) {
                        for (Ficha ficha : ambiente.fichas) {
                            for (Aprendiz aprendiz : ficha.aprendices) {
                                System.out.println("     -> " + aprendiz.nombre + " (" + aprendiz.documento + ") - Ficha: " + ficha.codigo);
                                aprendicesPorPrograma++;
                            }
                        }
                    }
                    System.out.println("     >>> Cantidad en el programa: " + aprendicesPorPrograma);
                }
            }
        }
    }
}

public static void reportarAmbientesYHorarios(Regional regional) {
    System.out.println("\n--- REPORTE DE AMBIENTES Y HORARIOS ---");

    // Reporte de ambientes por programa de formación
    System.out.println("\n1. Ambientes por Programa de Formación");
    for (Centro centro : regional.centros) {
        for (Sede sede : centro.sedes) {
            for (Linea linea : sede.lineas) {
                for (ProgramaFormacion programa : linea.programas) {
                    System.out.println("   - Programa: " + programa.nombre);
                    for (Ambiente ambiente : programa.ambientes) {
                        System.out.println("     -> Ambiente: " + ambiente.codigo + " (" + ambiente.descripcion + ")");
                    }
                }
            }
        }
    }
    
    // Reporte de horarios por jornada
    System.out.println("\n2. Horarios por Jornada");
    
    String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};
    for (String dia : dias) {
        System.out.println("\n   - Jornada del día " + dia + ":");
        int aprendicesEnJornada = 0;
        int instructoresEnJornada = 0;

        for (Centro centro : regional.centros) {
            for (Sede sede : centro.sedes) {
                for (Linea linea : sede.lineas) {
                    for (ProgramaFormacion programa : linea.programas) {
                        for (Ambiente ambiente : programa.ambientes) {
                            for (Actividad actividad : ambiente.horario) {
                                if (actividad.dia.equalsIgnoreCase(dia)) {
                                    System.out.println("     -> " + actividad.horaInicio + " - " + actividad.horaFin + 
                                                       " | Ambiente: " + actividad.ambiente.codigo + 
                                                       " | Instructor: " + actividad.instructor.nombre + 
                                                       " | Ficha: " + actividad.ficha.codigo + 
                                                       " | Cant. Aprendices: " + actividad.ficha.aprendices.size());
                                    
                                    aprendicesEnJornada += actividad.ficha.aprendices.size();
                                    instructoresEnJornada++;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("     >>> Total de aprendices en la jornada: " + aprendicesEnJornada);
        System.out.println("     >>> Total de instructores en la jornada: " + instructoresEnJornada);
    }
}
}



