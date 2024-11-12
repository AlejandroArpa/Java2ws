import java.util.ArrayList;
import java.util.List;

public class Ejercicio9 {
}

class Libro {
    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", disponible=" + (disponible ? "Sí" : "No") +
                '}';
    }
}

class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro agregado: " + libro);
    }

    public void prestarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                if (libro.isDisponible()) {
                    libro.setDisponible(false);
                    System.out.println("El libro '" + titulo + "' ha sido prestado.");
                } else {
                    System.out.println("El libro '" + titulo + "' ya está prestado.");
                }
                return;
            }
        }
        System.out.println("El libro '" + titulo + "' no se encontró en la biblioteca.");
    }

    public void devolverLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                if (!libro.isDisponible()) {
                    libro.setDisponible(true);
                    System.out.println("El libro '" + titulo + "' ha sido devuelto.");
                } else {
                    System.out.println("El libro '" + titulo + "' ya estaba disponible.");
                }
                return;
            }
        }
        System.out.println("El libro '" + titulo + "' no se encontró en la biblioteca.");
    }

    public void mostrarLibros() {
        if (libros.isEmpty()) {
            System.out.println("La biblioteca está vacía.");
        } else {
            System.out.println("Lista de libros:");
            for (Libro libro : libros) {
                System.out.println(libro);
            }
        }
    }
}