package uvg.edu.gt;

/**
 * Clase que representa a un paciente en un hospital.
 */
class Paciente implements Comparable<Paciente> {
    private String nombre;
    private String sintoma;
    private char codigoEmergencia;

    /**
     * Constructor.
     *
     * @param nombre           El nombre del paciente.
     * @param sintoma          El síntoma o la condición del paciente.
     * @param codigoEmergencia El código de emergencia del paciente (A,B,C,E,D).
     */
    public Paciente(String nombre, String sintoma, char codigoEmergencia) {
        this.nombre = nombre;
        this.sintoma = sintoma;
        this.codigoEmergencia = codigoEmergencia;
    }

    /**
     * Compara este paciente con otro paciente basado en su código de emergencia.
     *
     * @param otro El otro paciente para comparar.
     * @return Un valor negativo si este paciente tiene un código de emergencia menor que el otro,
     *         cero si tienen el mismo código de emergencia, o un valor positivo si es mayor.
     */
    @Override
    public int compareTo(Paciente otro) {
        return Character.compare(this.codigoEmergencia, otro.codigoEmergencia);
    }

    /**
     * Obtiene el nombre del paciente.
     *
     * @return El nombre del paciente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del paciente.
     *
     * @param nombre El nuevo nombre del paciente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el síntoma o condición del paciente.
     *
     * @return El síntoma o condición del paciente.
     */
    public String getSintoma() {
        return sintoma;
    }

    /**
     * Establece el síntoma o condición del paciente.
     *
     * @param sintoma El nuevo síntoma o condición del paciente.
     */
    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    /**
     * Obtiene el código de emergencia del paciente.
     *
     * @return El código de emergencia del paciente.
     */
    public char getCodigoEmergencia() {
        return codigoEmergencia;
    }

    /**
     * Establece el código de emergencia del paciente.
     *
     * @param codigoEmergencia El nuevo código de emergencia del paciente.
     */
    public void setCodigoEmergencia(char codigoEmergencia) {
        this.codigoEmergencia = codigoEmergencia;
    }
}
