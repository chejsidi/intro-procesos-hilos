package UD2_HILOS;

public class Ej2GestionarHilos {

    static void main() throws InterruptedException {
        System.out.println("-------------------Comienzo hilo principal");
        HiloMayusculas hm = new HiloMayusculas();
        Thread hiloMayus = new Thread(hm, "HiloMayus");
        System.out.println("Estado hiloMayus: " + hiloMayus.getState());
        hiloMayus.start();
        System.out.println("Estado hiloMayus: " + hiloMayus.getState());


        HiloMinusculas hmin = new HiloMinusculas();
        Thread hiloMin = new Thread(hmin, "HiloMin");
        System.out.println("Estado hiloMin: " + hiloMin.getState());
        hiloMin.start();
        System.out.println("Estado hiloMin: " + hiloMin.getState());



        HiloNumeros hnum = new HiloNumeros();
        Thread hiloNums = new Thread(hnum, "hiloNums");
        System.out.println("Estado hiloNums: " + hiloNums.getState());
        hiloNums.start();
        System.out.println("Estado hiloNums: " + hiloNums.getState());


        hiloMin.join();
        hiloMayus.join();
        hiloNums.join();
        // esperamos a que todos terminen
        System.out.println("Estado hiloMayus: " + hiloMayus.getState());
        System.out.println("Estado hiloMin: " + hiloMin.getState());
        System.out.println("Estado hiloNums: " + hiloNums.getState());
        System.out.println("---------------- Se termino el hilo principal");

    }
}


class HiloMinusculas implements Runnable{

    @Override
    public void run() {
        System.out.println("----------Comiezon del hilo con nombre: " + Thread.currentThread().getName());
        for (char i = 'a'; i < 'z'; i++) {
            System.out.println("letra: " + i);

        }
        try {
            Thread.sleep(2000); // Aqui stara en TIMED_WAITING
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


class HiloNumeros implements Runnable{

    @Override
    public void run() {
        System.out.println("----------Comiezon del hilo con nombre: " + Thread.currentThread().getName());
        for (int i = 1; i < 50; i++) {
            System.out.println("numero: " + i);

        }
        try {
            Thread.sleep(2000); // Aqui stara en TIMED_WAITING
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class HiloMayusculas implements Runnable{

    @Override
    public void run() {
        System.out.println("----------Comiezon del hilo con nombre: " + Thread.currentThread().getName());
        for (char i = 'A'; i < 'Z'; i++) {
            System.out.println("letra (mayus): " + i);

        }
        try {
            Thread.sleep(2000); // Aqui stara en TIMED_WAITING
            System.out.println("Estado " + Thread.currentThread().getName() + ": " +Thread.currentThread().getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}