package ejercicio3;

public class Mascota {
    String animal;
    String raza;
    int edad;
    public Mascota(String animal, String raza, int edad) {
        this.animal = animal;
        this.raza = raza;
        this.edad=edad;
    }
}
class Duenio extends Mascota {
    String nombre;
    String apellido;
    int edad_duenio;
    String direccion;
    int n_mascotas;

    public Duenio(String animal,String raza,int edad, String nombre, String apellido, int edad_duenio, String direccion,int n_mascotas){
        super(animal,raza,edad);
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad_duenio=edad_duenio;
        this.direccion=direccion;
        this.n_mascotas=n_mascotas;

    }
    public void imprimir(){
        System.out.println("---DATOS MASCOTA---\nAnimal: "+animal+"\nRaza: "+raza+"\nEdad: "+edad+"\n---DATOS DUEÑO---\n"+"Nombre: "+nombre+" "+apellido+"\nEdad: "+edad_duenio+"\nDirección: "+direccion+"\nN° de mascotas: "+n_mascotas);
    }
}
