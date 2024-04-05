package uvg.edu.gt;

import java.util.PriorityQueue;

/**
 * Clase Hospital que realiza una cola de pacientes utilizando una PriorityQueue.
 */
public class Hospital {
    private PriorityQueue<Paciente> cola;

    /**
     * Constructor de la clase Hospital.
     */
    public Hospital() {
        cola = new PriorityQueue<>();
    }

    /**
     * Agrega un paciente a la cola del hospital.
     *
     * @param paciente El paciente a agregar.
     */
    public void agregarPaciente(Paciente paciente) {
        cola.add(paciente);
    }

    /**
     * Obtiene y elimina al siguiente paciente de la cola del hospital.
     *
     * @return El siguiente paciente en la cola.
     */
    public Paciente siguientePaciente() {
        return cola.poll();
    }
}