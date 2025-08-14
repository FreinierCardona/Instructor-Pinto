import java.util.ArrayList;
import java.util.List;

public class Centro {
    public String nombre;
    public List<Sede> sedes = new ArrayList<>();

    public void agregarSede(Sede sede) {
        this.sedes.add(sede);
    }
}