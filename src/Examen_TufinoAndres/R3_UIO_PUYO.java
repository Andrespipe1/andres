package Examen_TufinoAndres;

public class R3_UIO_PUYO extends Normal{
    public String placaBus;
    public int horasViaje;
    public double precioPasaje;

    public R3_UIO_PUYO(int cedula, String nombre, int idTicket, String fechaViaje, int nAsiento, String lugarAsiento, int nMaletas, String placaBus, int horasViaje, double precioPasaje) {
        super(cedula, nombre, idTicket, fechaViaje, nAsiento, lugarAsiento, nMaletas);
        this.placaBus = placaBus;
        this.horasViaje=horasViaje;
        this.precioPasaje=precioPasaje;
    }
    public void calcularCosto(){
        double costo=precioPasaje;
        System.out.println("El valor del pasaje es: "+costo);
    }
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("BUS: "+placaBus+"| Tiempo de viaje: "+horasViaje+" horas | Precio Viaje: "+precioPasaje);
    }
}