package Examen_TufinoAndres;

public class R4_UIO_RIOB_Vip extends Vip {
    public String placaBus;
    public int horasViaje;
    public double precioPasaje;

    public R4_UIO_RIOB_Vip(int cedula, String nombre, int idTicket, String fechaViaje, int nAsiento, String lugarAsiento, int nMaletas,int recargo, String placaBus, int horasViaje, double precioPasaje) {
        super(cedula, nombre, idTicket, fechaViaje, nAsiento, lugarAsiento, nMaletas,recargo);
        this.placaBus = placaBus;
        this.horasViaje=horasViaje;
        this.precioPasaje=precioPasaje;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("BUS: "+placaBus+"| Tiempo de viaje: "+horasViaje+" horas | Precio Viaje: "+precioPasaje);
    }
}
