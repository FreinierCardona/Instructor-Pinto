import java.util.ArrayList;
import java.util.List;

public class Linea {
    public String nombre;
    public List<ProgramaFormacion> programas = new ArrayList<>();

    // Método para añadir un programa a la lista de la línea
    public void agregarPrograma(ProgramaFormacion programa) {
        this.programas.add(programa);
    }
}