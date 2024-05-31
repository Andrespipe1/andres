package Ejercicio_inmobiliaria;

public class CasaIndividual extends Inmueble{
    private double tamanoTerreno;

    public CasaIndividual(String direccion, double tamano, int numHabitaciones, double precio, double tamanoTerreno){
        super(direccion,tamano,numHabitaciones,precio);
        this.tamanoTerreno=tamanoTerreno;
    }
    public double getTamanoTerreno() {return tamanoTerreno;
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("---CASA---");
        super.mostrarInformacion();
        System.out.println("-Tamaño del terreno: "+tamanoTerreno+" m^2"+"\n");
    }
}
