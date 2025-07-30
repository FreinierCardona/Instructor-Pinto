import java.util.ArrayList;
import java.util.List;

public class Ambiente {
    public String codigo;
    public String descripcion;
    public List<Ficha> fichas = new ArrayList<>();
    public List<Actividad> horario = new ArrayList<>();

    // Método para añadir una ficha al ambiente
    public void agregarFicha(Ficha ficha) {
        this.fichas.add(ficha);
    }
}