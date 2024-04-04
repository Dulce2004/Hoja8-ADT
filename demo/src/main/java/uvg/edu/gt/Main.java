package uvg.edu.gt;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.PriorityQueue;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Utilizando java.util.PriorityQueue
        PriorityQueue<Paciente> colaJava = new PriorityQueue<>();

        try {
            Scanner scanner = new Scanner(new File("pacientes.txt"));
            while (scanner.hasNextLine()) {
                String[] datos = scanner.nextLine().split(",");
                String nombre = datos[0].trim();
                String sintoma = datos[1].trim();
                char codigoEmergencia = datos[2].trim().charAt(0);
                Paciente paciente = new Paciente(nombre, sintoma, codigoEmergencia);
                colaJava.add(paciente);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Método con java.util.PriorityQueue:");
        System.out.println("-----------------------------------------");
        Paciente siguienteJava = colaJava.poll();
        while (siguienteJava != null) {
            System.out.println(siguienteJava.getNombre() + ", " + siguienteJava.getSintoma() + ", " + siguienteJava.getCodigoEmergencia());
            siguienteJava = colaJava.poll();
        }

        System.out.println("\n\n");

        // Utilizando VectorHeap
        VectorHeap<Paciente> colaVector = new VectorHeap<>();

        try {
            Scanner scanner = new Scanner(new File("pacientes.txt"));
            while (scanner.hasNextLine()) {
                String[] datos = scanner.nextLine().split(",");
                String nombre = datos[0].trim();
                String sintoma = datos[1].trim();
                char codigoEmergencia = datos[2].trim().charAt(0);
                Paciente paciente = new Paciente(nombre, sintoma, codigoEmergencia);
                colaVector.add(paciente);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Método con VectorHeap y Comparable:");
        System.out.println("-----------------------------------------");
        Paciente siguienteVector = colaVector.remove();
        while (siguienteVector != null) {
            System.out.println(siguienteVector.getNombre() + ", " + siguienteVector.getSintoma() + ", " + siguienteVector.getCodigoEmergencia());
            siguienteVector = colaVector.remove();
        }
    }
}
