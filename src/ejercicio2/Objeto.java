package ejercicio2;

public class Objeto {
    String nombre;
    String accion;
    public Objeto(String nombre, String accion){
        this.nombre=nombre;
        this.accion=accion;
    }

    public void imprimir(){
        System.out.println("nombre: "+nombre+ "accion:"+accion);
    }
}
