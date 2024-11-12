import java.util.ArrayList;
import java.util.List;

public class Ejercicio20 {
}


class CuentaBancaria {
    private String titular;
    private double saldo;
    private List<String> historialTransacciones;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.historialTransacciones = new ArrayList<>();
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<String> getHistorialTransacciones() {
        return historialTransacciones;
    }

    public void realizarTransferencia(CuentaBancaria cuentaDestino, double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;
            cuentaDestino.saldo += monto;
            String transaccion = "Transferencia de " + monto + " desde " + titular + " a " + cuentaDestino.getTitular();
            historialTransacciones.add(transaccion);
            cuentaDestino.historialTransacciones.add("Transferencia de " + monto + " desde " + titular);
            System.out.println("Transferencia exitosa de " + monto + " a " + cuentaDestino.getTitular());
        } else {
            System.out.println("Saldo insuficiente o monto inválido.");
        }
    }
}

class Banco {
    private List<CuentaBancaria> cuentasBancarias;

    public Banco() {
        this.cuentasBancarias = new ArrayList<>();
    }

    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentasBancarias.add(cuenta);
    }

    public CuentaBancaria obtenerCuenta(String titular) {
        for (CuentaBancaria cuenta : cuentasBancarias) {
            if (cuenta.getTitular().equalsIgnoreCase(titular)) {
                return cuenta;
            }
        }
        System.out.println("Cuenta no encontrada.");
        return null;
    }

    public void consultarHistorial(String titular) {
        CuentaBancaria cuenta = obtenerCuenta(titular);
        if (cuenta != null) {
            System.out.println("Historial de transacciones para " + titular + ":");
            for (String transaccion : cuenta.getHistorialTransacciones()) {
                System.out.println(transaccion);
            }
        }
    }
}