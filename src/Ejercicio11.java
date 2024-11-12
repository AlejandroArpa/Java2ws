public class Ejercicio11 {
}

class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int anio;

    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public void describir() {
        System.out.println("Vehículo: " + marca + " " + modelo + ", Año: " + anio);
    }
}

class Auto extends Vehiculo {
    private int numPuertas;

    public Auto(String marca, String modelo, int anio, int numPuertas) {
        super(marca, modelo, anio);
        this.numPuertas = numPuertas;
    }

    @Override
    public void describir() {
        super.describir();
        System.out.println("Este auto tiene " + numPuertas + " puertas.");
    }
}

class Moto extends Vehiculo {
    private String tipoCasco;

    public Moto(String marca, String modelo, int anio, String tipoCasco) {
        super(marca, modelo, anio);
        this.tipoCasco = tipoCasco;
    }

    @Override
    public void describir() {
        super.describir();
        System.out.println("Esta moto incluye un casco de tipo: " + tipoCasco);
    }
}