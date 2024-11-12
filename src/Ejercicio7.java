import java.util.ArrayList;
import java.util.List;

public class Ejercicio7 {
}

class Estudiante {
    private String nombre;
    private List<Double> listaNotas;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.listaNotas = new ArrayList<>();
    }

    public void agregarNota(double nota) {
        if (nota >= 0 && nota <= 100) {
            listaNotas.add(nota);
            System.out.println("Nota agregada: " + nota);
        } else {
            System.out.println("Nota inválida. Debe estar entre 0 y 100.");
        }
    }

    public double calcularPromedio() {
        if (listaNotas.isEmpty()) {
            System.out.println("No hay notas registradas para " + nombre);
            return 0.0;
        }

        double suma = 0;
        for (double nota : listaNotas) {
            suma += nota;
        }
        return suma / listaNotas.size();
    }


    public boolean aprobo() {
        double promedio = calcularPromedio();
        return promedio >= 60;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", promedio=" + calcularPromedio() +
                ", aprobado=" + (aprobo() ? "Sí" : "No") +
                '}';
    }
}