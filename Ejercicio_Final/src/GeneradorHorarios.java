import java.util.Random;

public class GeneradorHorarios {

    public void generar(Regional regional) {
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};
        String[] horas = {"08:00", "10:00", "12:00", "14:00", "16:00"};
        Random random = new Random();

        // Se recorre toda la estructura de la regional para llegar a las fichas
        for (Centro centro : regional.centros) {
            for (Sede sede : centro.sedes) {
                for (Linea linea : sede.lineas) {
                    for (ProgramaFormacion programa : linea.programas) {
                        for (Ambiente ambiente : programa.ambientes) {
                            for (Ficha ficha : ambiente.fichas) {
                                Instructor instructorAsignado = programa.instructores.isEmpty() ? null : programa.instructores.get(random.nextInt(programa.instructores.size()));

                                if (instructorAsignado != null) {
                                    String dia = dias[random.nextInt(dias.length)];
                                    String horaInicio = horas[random.nextInt(horas.length)];
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
        System.out.println(" ¡REGISTRO Y HORARIOS COMPLETADOS!");
    }
}