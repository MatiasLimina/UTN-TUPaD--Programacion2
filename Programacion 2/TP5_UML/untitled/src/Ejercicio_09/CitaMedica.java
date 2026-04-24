package Ejercicio_09;

public class CitaMedica {
    String fecha;
    String hora;
    Profesional profesional;
    Paciente paciente;

    public CitaMedica(String fecha, String hora, Profesional profesional, Paciente paciente) {
        this.fecha = fecha;
        this.hora = hora;
        this.profesional = profesional;
        this.paciente = paciente;
    }

    public String getFecha() {
        return fecha;
    }
    public String getHora() {
        return hora;
    }
    public Profesional getProfesional() {
        return profesional;
    }
    public Paciente getPaciente() {
        return paciente;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "CitaMedica{" + "fecha=" + fecha + ", hora=" + hora + ", profesional=" + profesional.getNombre() + ", paciente=" + paciente.getNombre() + '}';
    }
}
