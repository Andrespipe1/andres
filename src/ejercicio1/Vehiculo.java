package ejercicio1;

//github 23/05/2024
public class Vehiculo {
    String placa;
    String marca;
    public Vehiculo(String placa, String marca) {
        this.placa=placa;
        this.marca=marca;
    }
    public void imprimir(){
        System.out.println(placa+" "+marca);
    }
}
class Publico extends Vehiculo{
    String servicio;

    public Publico(String placa,String marca,String servicio){
        super(placa,marca);
        this.servicio=servicio;
    }
    @Override
    public void imprimir() {
        super.imprimir();
    }
}
class Privado extends Vehiculo {
    String modelo;
    String propietario;

    public Privado(String placa, String marca, String modelo, String propietario) {
        super(placa, marca);
        this.modelo = modelo;
        this.propietario = propietario;
    }
}