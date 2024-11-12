public class Ejercicio12 {
}

class Personaje {
    protected String nombre;
    protected int nivel;

    public Personaje(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public void atacar() {
        System.out.println(nombre + " ataca de forma genérica.");
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                '}';
    }
}

class Guerrero extends Personaje {
    private String arma;

    // Constructor
    public Guerrero(String nombre, int nivel, String arma) {
        super(nombre, nivel);
        this.arma = arma;
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " ataca con un " + arma + " causando un golpe poderoso.");
    }
}

class Mago extends Personaje {
    private String hechizoPrincipal;

    public Mago(String nombre, int nivel, String hechizoPrincipal) {
        super(nombre, nivel);
        this.hechizoPrincipal = hechizoPrincipal;
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " lanza el hechizo " + hechizoPrincipal + " desatando un gran poder mágico.");
    }
}