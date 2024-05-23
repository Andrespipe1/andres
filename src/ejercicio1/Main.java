package ejercicio1;

public class Main {
    public static void main(String[] args){
        Publico v1=new Publico("PAQ123","Mercedes Benz","Bus Escolar");
        v1.imprimir();
        Privado v2=new Privado("PPA245","Renault","Logan","Jaime");
        v2.imprimir();
    }
}