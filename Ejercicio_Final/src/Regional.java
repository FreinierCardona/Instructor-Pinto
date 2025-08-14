import java.util.ArrayList;
import java.util.List;

public class Regional {
    public String nombre;
    public List<Centro> centros = new ArrayList<>();

    public void agregarCentro(Centro centro) {
        this.centros.add(centro);
    }
}