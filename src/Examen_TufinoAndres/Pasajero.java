package Examen_TufinoAndres;

public class Pasajero{
    private int cedula;
    private String nombre;
    public int getCedula() {
        return cedula;}
    public void setCedula(int cedula) {
        this.cedula = cedula;}
    public String getNombre() {
        return nombre;}
    public void setNombre(String nombre) {
        this.nombre = nombre;}
    public Pasajero(int cedula, String nombre){
        this.cedula=cedula;
        this.nombre=nombre;
    }
    public void mostrarInfo(){
        System.out.println("\n-----Datos del viaje----");
        System.out.println("Cedula: "+cedula+"\nNombre: "+nombre);
    }

}
