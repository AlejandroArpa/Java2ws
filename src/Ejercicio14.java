public class Ejercicio14 {
}

class Pago {
    protected double monto;

    public Pago(double monto) {
        this.monto = monto;
    }

    public void procesarPago() {
        System.out.println("Procesando un pago genérico de $" + monto);
    }

    @Override
    public String toString() {
        return "Pago{" +
                "monto=" + monto +
                '}';
    }
}

class PagoTarjeta extends Pago {
    private String numeroTarjeta;
    private String nombreTitular;

    public PagoTarjeta(double monto, String numeroTarjeta, String nombreTitular) {
        super(monto);
        this.numeroTarjeta = numeroTarjeta;
        this.nombreTitular = nombreTitular;
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando un pago con tarjeta de $" + monto +
                " a nombre de " + nombreTitular +
                " con número de tarjeta " +
                numeroTarjeta.substring(0, 4) + "****");
    }
}

class PagoEfectivo extends Pago {

    public PagoEfectivo(double monto) {
        super(monto);
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando un pago en efectivo de $" + monto);
    }
}