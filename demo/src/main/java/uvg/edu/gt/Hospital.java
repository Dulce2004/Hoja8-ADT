package uvg.edu.gt;
import java.util.PriorityQueue;

public class Hospital {
    private PriorityQueue<Paciente> cola;

    public Hospital() {
        cola = new PriorityQueue<>();
    }

    public void agregarPaciente(Paciente paciente) {
        cola.add(paciente);
    }

    public Paciente siguientePaciente() {
        return cola.poll();
    }
}


