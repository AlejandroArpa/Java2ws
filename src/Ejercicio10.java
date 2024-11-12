public class Ejercicio10 {
}

class Empleado {
    private String nombre;
    private double salarioBase;
    private int aniosExperiencia;

    public Empleado(String nombre, double salarioBase, int aniosExperiencia) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.aniosExperiencia = aniosExperiencia;
    }

    public double calcularBono() {
        double porcentajeBono = 0.05 * aniosExperiencia;
        double bono = salarioBase * porcentajeBono;
        return bono;
    }

    public double calcularSalarioTotal() {
        return salarioBase + calcularBono();
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", salarioBase=" + salarioBase +
                ", aniosExperiencia=" + aniosExperiencia +
                ", bono=" + calcularBono() +
                ", salarioTotal=" + calcularSalarioTotal() +
                '}';
    }
}