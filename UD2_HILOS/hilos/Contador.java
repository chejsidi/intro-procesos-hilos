package UD2_HILOS.hilos;

public class Contador extends Thread{
    @Override
    public void run() {
        System.out.println("-------------Empezando hilo contador");
        for (int i = 1; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
