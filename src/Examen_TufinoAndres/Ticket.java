package Examen_TufinoAndres;

public class Ticket extends Pasajero {
    private int idTicket;
    private String fechaViaje;

    public int getIdTicket() {
        return idTicket;}
    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;}
    public String getFechaViaje() {
        return fechaViaje;}
    public void setFechaViaje(String fechaViaje) {
        this.fechaViaje = fechaViaje;}

    public Ticket(int cedula, String nombre,int idTicket, String fechaViaje) {
        super(cedula,nombre);
        this.idTicket = idTicket;
        this.fechaViaje=fechaViaje;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Cod Ticket: "+idTicket+" | Fecha salida: "+fechaViaje);
    }
}
