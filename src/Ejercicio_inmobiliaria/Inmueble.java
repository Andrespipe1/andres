package Ejercicio_inmobiliaria;

public class Inmueble {
    private String direccion;
    private double tamano;
    private int numHabitaciones;
    private double precio;

    public String getDireccion() {
        return direccion;
    }

    public double getTamano() {
        return tamano;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public double getPrecio() {
        return precio;
    }

    public Inmueble(String direccion, double tamano, int numHabitaciones, double precio){
        this.direccion=direccion;
        this.tamano=tamano;
        this.numHabitaciones=numHabitaciones;
        this.precio =precio;

    }
    public void mostrarInformacion(){
    System.out.println("--- Inmueble ---\nDirección: "+direccion+"\n-Tamaño: "+tamano+" m^2"+"\n-Habitaciones: "+numHabitaciones+"\n-Precio: "+precio);
    }
}
