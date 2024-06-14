package Examen_TufinoAndres;

public class Vip extends Ticket{
    public int nAsiento;
    public String lugarAsiento;
    public int nMaletas;
    public int recargo;
    public Vip(int cedula, String nombre, int idTicket, String fechaViaje, int nAsiento,String lugarAsiento,int nMaletas, int recargo) {
        super(cedula, nombre, idTicket, fechaViaje);
        this.nAsiento = nAsiento;
        this.lugarAsiento=lugarAsiento;
        this.nMaletas=nMaletas;
        this.recargo=recargo;
    }
    @Override
    public void mostrarInfo(){
        System.out.println("---Viaje normal---\nN° Asiento: "+nAsiento+"\nLugar: "+lugarAsiento+"\nMaletas: "+nMaletas+" Recargo del: "+recargo+"%");
    }
}
