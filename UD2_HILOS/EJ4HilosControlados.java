package UD2_HILOS;

import java.util.List;

public class EJ4HilosControlados {
    hiloListaCiudades hc = new hiloListaCiudades(List.of("madrid", "barcelona", "grecia", "bilbao"));
    hiloMultiplos5 hm5 = new hiloMultiplos5();
    hiloSumatorioImpares hsi = new hiloSumatorioImpares();

    Thread hiloCiudades = new Thread(hc, "HiloCiudades");
}



class hiloMultiplos5 implements Runnable {

    @Override
    public void run() {
        System.out.println("---------------Comienzo del hilo: " + Thread.currentThread().getName());
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + ": " + (5*i));
        }

        System.out.println("---------------Fin del hilo: " + Thread.currentThread().getName());
    }
}

class hiloSumatorioImpares implements Runnable {

    @Override
    public void run() {
        System.out.println("---------------Comienzo del hilo: " + Thread.currentThread().getName());
        int sumatorio = 0;
        for (int i = 1; i <= 20; i++) {
            if( i % 2 != 0){
                sumatorio += i;
            }
        }
        System.out.println("El sumatorio de los impares hasta el 20, es: " + sumatorio);
        System.out.println("---------------Fin del hilo: " + Thread.currentThread().getName());
    }
}

class hiloListaCiudades implements Runnable {
    private List<String> ciudades;
    public hiloListaCiudades(List<String> ciudades) {
        this.ciudades = ciudades;
    }

    @Override
    public void run() {
        System.out.println("---------------Comienzo del hilo: " + Thread.currentThread().getName());
        for(String ciudad: this.ciudades){
            System.out.println(ciudad);
        }
    }
}