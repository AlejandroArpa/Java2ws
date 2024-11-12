import java.util.ArrayList;
import java.util.List;

public class Ejercicio16 {
}

class Producto {
    private String nombre;
    private String categoria;
    private double precio;
    private int stock;

    public Producto(String nombre, String categoria, double precio, int stock) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", categoria='" + categoria + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }
}

class Inventario {
    private List<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado: " + producto);
    }


    public boolean eliminarProducto(String nombre) {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                productos.remove(producto);
                System.out.println("Producto eliminado: " + producto);
                return true;
            }
        }
        System.out.println("Producto no encontrado.");
        return false;
    }

    public Producto buscarProductoPorNombre(String nombre) {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null;
    }

    public List<Producto> buscarProductosPorCategoria(String categoria) {
        List<Producto> productosCategoria = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getCategoria().equalsIgnoreCase(categoria)) {
                productosCategoria.add(producto);
            }
        }
        return productosCategoria;
    }

    public boolean realizarVenta(String nombre, int cantidad) {
        Producto producto = buscarProductoPorNombre(nombre);
        if (producto != null) {
            if (producto.getStock() >= cantidad) {
                producto.setStock(producto.getStock() - cantidad);
                System.out.println("Venta realizada: " + cantidad + " unidades de " + nombre + " vendidas.");
                return true;
            } else {
                System.out.println("Stock insuficiente para realizar la venta.");
                return false;
            }
        }
        System.out.println("Producto no encontrado.");
        return false;
    }

    public void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
        } else {
            for (Producto producto : productos) {
                System.out.println(producto);
            }
        }
    }
}