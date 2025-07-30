public class Actividad {
    public Ficha ficha;
    public Ambiente ambiente;
    public Instructor instructor;
    public String dia;        
    public String horaInicio; 
    public String horaFin;
    
    public Actividad(Ficha ficha, Ambiente ambiente, Instructor instructor, String dia, String horaInicio, String horaFin) {
        this.ficha = ficha;
        this.ambiente = ambiente;
        this.instructor = instructor;
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }
}