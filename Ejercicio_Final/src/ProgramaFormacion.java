import java.util.ArrayList;
import java.util.List;

public class ProgramaFormacion {
    public String nombre;
    public List<Ambiente> ambientes = new ArrayList<>();
    public List<Instructor> instructores = new ArrayList<>();

    // Método para añadir un ambiente al programa
    public void agregarAmbiente(Ambiente ambiente) {
        this.ambientes.add(ambiente);
    }

    // Método para añadir un instructor al programa
    public void agregarInstructor(Instructor instructor) {
        this.instructores.add(instructor);
    }
}