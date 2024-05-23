package ejercicio3;

public class Mascota {
    String animal;
    String raza;
    int edad;

    public Mascota(String animal, String raza, int edad) {
        this.animal = animal;
        this.raza = raza;
        this.edad = edad;
    }
}

    class Duenio {
    String nombre;
    String apellido;
    int edad;
    String direccion;
    int n_mascotas;

    public Duenio(String nombre, String apellido, int edad, String direccion, int n_mascotas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
        this.n_mascotas = n_mascotas;
    }
}

    class Veterinario {
    String nombre;
    String apellido;
    String nombre_clinica;

    public Veterinario(String nombre, String apellido, String nombre_clinica) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nombre_clinica = nombre_clinica;
    }

    public void examinarMascota(Mascota mascota) {

    }
}
