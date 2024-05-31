package Ejercicio_inmobiliaria;
import Practica_inmobiliaria.Persona;
public class Main {
    public static void main(String[] args){
        Departamento dep1 = new Departamento("Iñaquito",50,2,120500,8);
        dep1.mostrarInformacion();
        CasaIndividual casa1 = new CasaIndividual("Tumbaco",90,4,220500,100.50);
        casa1.mostrarInformacion();
        Suite s1 = new Suite("Iñaquito",60,2,300500,true);
        s1.mostrarInformacion();
        Persona p1 = new Persona("Andres","Tufiño");
        p1.mostrarinfop();
    }
}
