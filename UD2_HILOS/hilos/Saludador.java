package UD2_HILOS.hilos;

public class Saludador implements Runnable{
    @Override
    public void run() {
        System.out.println("-------------Empezando hilo saludador");
        for (int i = 1; i < 5; i++) {
            System.out.println("Hola " + i);
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
