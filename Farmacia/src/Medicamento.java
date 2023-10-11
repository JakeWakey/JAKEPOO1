// Clase que representa un medicamento con nombre y cantidad en inventario
class Medicamento {
    private final String nombre;
    private int cantidad;

    public Medicamento(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }
    // Método para reducir la cantidad de inventario cuando se vende un medicamento
    public void reducirInventario(int cantidadVendida) {
        if (cantidadVendida <= cantidad) {
            cantidad -= cantidadVendida;
        } else {
            System.out.println("No hay suficiente stock de " + nombre);
        }
    }

    // Método para aumentar la cantidad de inventario cuando se compra un medicamento
    public void aumentarInventario(int cantidadComprada) {
        cantidad += cantidadComprada;
    }
}

