import java.util.ArrayList;
import java.util.List;

public class Sede {
    public String nombre;
    public List<Linea> lineas = new ArrayList<>();

    // Método para añadir una línea a la lista de la sede
    public void agregarLinea(Linea linea) {
        this.lineas.add(linea);
    }
}