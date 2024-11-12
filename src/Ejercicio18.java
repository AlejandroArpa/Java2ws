public class Ejercicio18 {
}

class Empleado {
    private String nombre;
    private double pagoPorHora;
    private double horasTrabajadas;

    public Empleado(String nombre, double pagoPorHora) {
        this.nombre = nombre;
        this.pagoPorHora = pagoPorHora;
        this.horasTrabajadas = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPagoPorHora() {
        return pagoPorHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void registrarHoras(double horas) {
        this.horasTrabajadas += horas;
    }
}

class ControlDeHoras {
    private static final double HORAS_EXTRA = 40;
    private static final double PAGO_EXTRA = 1.5;

    public double calcularSalarioSemanal(Empleado empleado) {
        double horasNormales = Math.min(empleado.getHorasTrabajadas(), HORAS_EXTRA);
        double horasExtras = Math.max(0, empleado.getHorasTrabajadas() - HORAS_EXTRA);
        double salario = horasNormales * empleado.getPagoPorHora();
        salario += horasExtras * empleado.getPagoPorHora() * PAGO_EXTRA;
        return salario;
    }
}
