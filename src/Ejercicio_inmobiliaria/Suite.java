package Ejercicio_inmobiliaria;

public class Suite extends Inmueble{
    private boolean tieneJacuzzi;
    public Suite(String direccion,double tamano,int numHabitaciones, double precio,boolean tieneJacuzzi){
        super(direccion,tamano,numHabitaciones,precio);
        this.tieneJacuzzi=tieneJacuzzi;
    }
    public boolean isTieneJacuzzi() {
        return tieneJacuzzi;
    }
    @Override
    public void mostrarInformacion(){
        System.out.println("---SUITE---");
        super.mostrarInformacion();
        System.out.println("-Jacuzzi: "+tieneJacuzzi+"\n");
    }
}
