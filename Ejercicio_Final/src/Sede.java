import java.util.ArrayList;
import java.util.List;

public class Sede {
    public String nombre;
    public List<Linea> lineas = new ArrayList<>();

    public void agregarLinea(Linea linea) {
        this.lineas.add(linea);
    }
}