package Examen_TufinoAndres;

public class Vip extends Ticket{
    public int nAsiento;
    public String lugarAsiento;
    public int nMaletas;
    public double recargo;

    public double getRecargo() {
        return recargo;
    }

    public Vip(int cedula, String nombre, int idTicket, String fechaViaje, int nAsiento, String lugarAsiento, int nMaletas, double recargo) {
        super(cedula, nombre, idTicket, fechaViaje);
        this.nAsiento = nAsiento;
        this.lugarAsiento=lugarAsiento;
        this.nMaletas=2;
        this.recargo=recargo;
    }
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("---Viaje VIP---\nN° Asiento: "+nAsiento+"\nLugar: "+lugarAsiento+"\nMaletas: "+nMaletas+" Recargo del: 30%");
    }
}
