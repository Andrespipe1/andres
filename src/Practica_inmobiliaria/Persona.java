package Practica_inmobiliaria;

public class Persona {
    public String nombre;
    public String apellido;
    public Persona(String nombre, String apellido){
        this.nombre=nombre;
        this.apellido=apellido;
    }
    public void mostrarinfop(){
        System.out.println("Nombre: "+nombre+"\nApellido: "+apellido);
    }
}
