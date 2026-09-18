package UD2_HILOS;

public class Ej3ContadorParImp {

    static void main() {
        hiloContarImpares hci = new hiloContarImpares();
        Thread hiloContImp = new Thread(hci, "HiloNumerosImpares");
        hiloContImp.setPriority(1);
        System.out.println("Prioridad (HiloNumerosImpares): " + hiloContImp.getPriority());

        hiloContarPares hcp = new hiloContarPares();
        Thread hiloContPares = new Thread(hcp, "hiloNumerosPares");
        hiloContPares.setPriority(10);
        System.out.println("Prioridad (hiloContPares): " + hiloContPares.getPriority());
        System.out.println("Prioridad (hiloContPares): " + hiloContPares.getPriority());

        hiloContImp.start();
        hiloContPares.start();
    }
}



class hiloContarPares implements Runnable {

    @Override
    public void run() {
        System.out.println("Estado del hilo " + Thread.currentThread().getName() + ": " + Thread.currentThread().getState());
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0){
                System.out.println("Num par: " + i);
            }
        }
    }
}

class hiloContarImpares implements Runnable {

    @Override
    public void run() {
        System.out.println("Estado del hilo " + Thread.currentThread().getName() + ": " + Thread.currentThread().getState());
        for (int i = 1; i <= 100; i++) {
            if(i % 2 != 0){
                System.out.println("Num impar: " + i);
            }
        }
    }
}