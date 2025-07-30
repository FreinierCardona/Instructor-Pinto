import java.util.ArrayList;
import java.util.List;

public class Centro {
    public String nombre;
    public List<Sede> sedes = new ArrayList<>();

    // Método para añadir una sede a la lista del centro
    public void agregarSede(Sede sede) {
        this.sedes.add(sede);
    }
}