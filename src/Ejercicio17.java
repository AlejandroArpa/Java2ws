import java.util.ArrayList;
import java.util.List;

public class Ejercicio17 {
}

class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
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
}

class Cliente {
    private String nombre;
    private String direccion;

    public Cliente(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }
}

class Pedido {
    private Cliente cliente;
    private List<Producto> productos;
    private double total;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.total = 0;
    }

    public void agregarProducto(Producto producto, int cantidad) {
        if (producto.getStock() >= cantidad) {
            productos.add(producto);
            total += producto.getPrecio() * cantidad;
            producto.setStock(producto.getStock() - cantidad);
        } else {
            System.out.println("Stock insuficiente para " + producto.getNombre());
        }
    }

    public double calcularTotal() {
        return total;
    }

    public void realizarCompra() {
        System.out.println("Compra realizada para " + cliente.getNombre());
        System.out.println("Total de la compra: " + calcularTotal());
    }
}