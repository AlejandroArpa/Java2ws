import java.util.ArrayList;
import java.util.List;

public class Ejercicio19 {
}

class Vuelo {
    private String codigoVuelo;
    private int asientosDisponibles;
    private List<Reserva> reservas;

    public Vuelo(String codigoVuelo, int asientosDisponibles) {
        this.codigoVuelo = codigoVuelo;
        this.asientosDisponibles = asientosDisponibles;
        this.reservas = new ArrayList<>();
    }

    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }

    public void reservarAsiento(Pasajero pasajero) {
        if (asientosDisponibles > 0) {
            int numeroAsiento = reservas.size() + 1;
            Reserva reserva = new Reserva(pasajero, numeroAsiento, this);
            reservas.add(reserva);
            asientosDisponibles--;
            System.out.println("Reserva exitosa: " + pasajero.getNombre() + " en el asiento " + numeroAsiento);
        } else {
            System.out.println("No hay asientos disponibles.");
        }
    }

    public void cancelarReserva(Reserva reserva) {
        reservas.remove(reserva);
        asientosDisponibles++;
        System.out.println("Reserva cancelada para " + reserva.getPasajero().getNombre());
    }
}

class Pasajero {
    private String nombre;
    private String documentoIdentidad;

    public Pasajero(String nombre, String documentoIdentidad) {
        this.nombre = nombre;
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }
}

class Reserva {
    private Pasajero pasajero;
    private int numeroAsiento;
    private Vuelo vuelo;

    public Reserva(Pasajero pasajero, int numeroAsiento, Vuelo vuelo) {
        this.pasajero = pasajero;
        this.numeroAsiento = numeroAsiento;
        this.vuelo = vuelo;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }
}