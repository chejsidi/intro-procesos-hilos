package UD2_HILOS;

import UD2_HILOS.hilos.Contador;
import UD2_HILOS.hilos.Saludador;

public class Ej1SaludarContar {
    static void main() throws InterruptedException {
        System.out.println("Comienzo hilo principal");

        // Con extends Thread
        Contador hc = new Contador();
        hc.start();
        // Con implements Runnable
        Saludador cs = new Saludador();
        Thread hs = new Thread(cs, "HiloSaludador"); // Ademas podemos cargarle el name cuando es Runnable
        hs.start();

        //TODO: Con el join() esperamos a que todos los hilos terminen y luego ejecutamos el codigo que quede:
        hc.join();
        hs.join();

        System.out.println("Se ha terminado el hilo principal");

    }
}


