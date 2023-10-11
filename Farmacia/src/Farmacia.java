import java.util.ArrayList;
import java.util.List;

public class Farmacia {
    // Lista para mantener un registro de medicamentos en el inventario
    private final List<Medicamento> inventario = new ArrayList<>();

    // Método para agregar un medicamento al inventario
    public void agregarMedicamento(String nombre, int cantidadInicial) {
        Medicamento medicamento = new Medicamento(nombre, cantidadInicial);
        inventario.add(medicamento);
    }

    // Método para comprar un medicamento a los visitadores médicos y aumentar el inventario
    public void comprarMedicamento(String nombre, int cantidadComprada) {
        for (Medicamento medicamento : inventario) {
            if (medicamento.getNombre().equals(nombre)) {
                medicamento.aumentarInventario(cantidadComprada);
                System.out.println(cantidadComprada + " unidades de " + nombre + " compradas.");
                return;
            }
        }
        System.out.println("El medicamento " + nombre + " no se encuentra en el inventario.");
    }

    // Método para vender un medicamento a un usuario y reducir el inventario
    public void venderMedicamento(String nombre, int cantidadVendida) {
        for (Medicamento medicamento : inventario) {
            if (medicamento.getNombre().equals(nombre)) {
                medicamento.reducirInventario(cantidadVendida);
                System.out.println(cantidadVendida + " unidades de " + nombre + " vendidas.");
                return;
            }
        }
        System.out.println("El medicamento " + nombre + " no se encuentra en el inventario.");
    }

    // Método para mostrar el inventario actual de la farmacia
    public void mostrarInventario() {
        System.out.println("Inventario de la farmacia:");
        for (Medicamento medicamento : inventario) {
            System.out.println(medicamento.getNombre() + ": " + medicamento.getCantidad() + " unidades");
        }
    }

    // Método principal donde se realizan pruebas de las funciones
    public static void main(String[] args) {
        Farmacia farmacia = new Farmacia();

        // Agregar algunos medicamentos al inventario con cantidades iniciales
        farmacia.agregarMedicamento("Paracetamol", 100);
        farmacia.agregarMedicamento("Ibuprofeno", 50);
        farmacia.agregarMedicamento("Aspirina", 75);

        // Mostrar el inventario inicial
        farmacia.mostrarInventario();

        // Realizar compras y ventas de medicamentos y mostrar el inventario actualizado
        farmacia.comprarMedicamento("Paracetamol", 20);
        farmacia.venderMedicamento("Ibuprofeno", 10);

        // Mostrar el inventario actualizado
        farmacia.mostrarInventario();
    }
}