package ito.poo;
import ito.poo.mazcota;
public class app {
    static mazcota mascota;

    static void run(){
        mascota= new mazcota("Satuk", 2, "perro", "chihuahua");
        System.out.println(mascota);
        mascota.cumpleAños();
        System.out.println("Despues de cumplir años"+mascota);
    }

    public static void main(String[] args){run();}
}