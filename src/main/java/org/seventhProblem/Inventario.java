package org.seventhProblem;

import java.util.List;

public class Inventario {
    private List<Producto> productos;
    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado al inventario.");
    }


    public void eliminarProducto(Producto producto) {
        if (productos.remove(producto)) {
            System.out.println("Producto eliminado del inventario.");
        } else {
            System.out.println("El producto no se encuentra en el inventario.");
        }
    }


    public void mostrarInventario() {
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío.");
            return;
        }
        System.out.println("Inventario:");
        for (Producto p : productos) {
            System.out.println("- Producto: " + p.getClass().getSimpleName() +
                    ", Precio: $" + p.obtenerPrecio() +
                    ", Stock: " + p.obtenerStock());
        }
    }

    public Producto buscarProducto(String nombre) {
        for (Producto p : productos) {
            if (p.getClass().getSimpleName().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
    }

}
