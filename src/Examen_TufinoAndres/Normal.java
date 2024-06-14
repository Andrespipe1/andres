package Examen_TufinoAndres;

public class Normal extends Ticket{
    public int nAsiento;
    public String lugarAsiento;
    public int nMaletas;

    public Normal(int cedula, String nombre, int idTicket, String fechaViaje, int nAsiento,String lugarAsiento,int nMaletas) {
        super(cedula, nombre, idTicket, fechaViaje);
        this.nAsiento = nAsiento;
        this.lugarAsiento=lugarAsiento;
        this.nMaletas=nMaletas;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("---Viaje normal---\nN° Asiento: "+nAsiento+"\nLugar: "+lugarAsiento+"\nMaletas: "+nMaletas);
    }
}
