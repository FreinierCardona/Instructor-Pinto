import java.util.ArrayList;
import java.util.List;

public class Ficha {
    public String codigo;
    public Ambiente ambiente; 
    public List<Aprendiz> aprendices = new ArrayList<>();
    public List<Actividad> horario = new ArrayList<>();

    public void agregarAprendiz(Aprendiz aprendiz) {
        this.aprendices.add(aprendiz);
    }
}