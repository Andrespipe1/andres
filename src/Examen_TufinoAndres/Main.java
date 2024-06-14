package Examen_TufinoAndres;

public class Main {
    public static void main(String[] args){
        R1_UIO_GYE v1 = new R1_UIO_GYE(175427864,"Andres Tufiño",5043,"16/08/2024",15,"Ventana",0,"ACE123",12,20);
        R1_UIO_GYE_Vip v2 = new R1_UIO_GYE_Vip(175427864,"Andres Tufiño",5043,"16/08/2024",15,"Ventana",0,0.30,"PAQ123",12,20);
        System.out.println("--- Sistema de Venta de Tickets ---");
        v1.mostrarInfo();
        v2.mostrarInfo();
        v2.calcularCostovip();
    }
}
