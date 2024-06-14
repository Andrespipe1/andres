package Examen_TufinoAndres;

public class R3_UIO_PUYO_Vip extends Vip{
    public String placaBus;
    public int horasViaje;
    public double precioPasaje;

    public R3_UIO_PUYO_Vip(int cedula, String nombre, int idTicket, String fechaViaje, int nAsiento, String lugarAsiento, int nMaletas,double recargo, String placaBus, int horasViaje, double precioPasaje) {
        super(cedula, nombre, idTicket, fechaViaje, nAsiento, lugarAsiento, nMaletas,recargo);
        this.placaBus = placaBus;
        this.horasViaje=horasViaje;
        this.precioPasaje=precioPasaje;
    }
    public void calcularCostovip(){
        double descuento=precioPasaje*getRecargo();
        double costo =precioPasaje + descuento;
        System.out.println("El valor del pasaje Vip es: "+costo);
    }
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("BUS: "+placaBus+"| Tiempo de viaje: "+horasViaje+" horas | Precio Viaje sin recargo: "+precioPasaje);
    }
}
