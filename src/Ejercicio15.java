import java.util.ArrayList;
import java.util.List;

public class Ejercicio15 {
}

class Vehiculo {
    private String marca;
    private String modelo;
    private int kilometraje;

    public Vehiculo(String marca, String modelo, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", kilometraje=" + kilometraje +
                '}';
    }
}

class Flota {
    private List<Vehiculo> vehiculos;

    public Flota() {
        this.vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
        System.out.println("Vehículo agregado: " + vehiculo);
    }

    public void registrarMantenimiento(int kilometrajeUmbral) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getKilometraje() >= kilometrajeUmbral) {
                System.out.println("El vehículo " + vehiculo.getMarca() + " " +
                        vehiculo.getModelo() + " necesita mantenimiento (Kilometraje: " +
                        vehiculo.getKilometraje() + ")");
            }
        }
    }

    public void mostrarVehiculos() {
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
        }
    }
}