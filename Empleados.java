import java.util.ArrayList;

/**
 * Clase que gestiona una lista de empleados y operaciones sobre ellos.
 */
public class Empleados {
    /**
     * Lista de empleados.
     */
    public ArrayList<Empleado> lista;

    /**
     * Constructor que inicializa la lista de empleados.
     */
    public Empleados() {
        lista = new ArrayList<>();
    }

    /**
     * Da de alta (añade) un nuevo empleado a la lista.
     * @param empleado Empleado a añadir.
     */
    public void darDeAltaEmpleado(Empleado empleado) {
        lista.add(empleado);
    }

    /**
     * Muestra por pantalla todos los empleados de la lista.
     */
    public void mostrarEmpleados() {
        for (Empleado empleado : lista) {
            System.out.println(empleado);
        }
    }

    /**
     * Aumenta el salario de todos los empleados en un porcentaje dado.
     * @param porcentaje Porcentaje de aumento.
     */
    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }
}