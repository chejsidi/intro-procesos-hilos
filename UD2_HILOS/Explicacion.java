package UD2_HILOS;

public class Explicacion {

    // LOS HILOS UNICAMENTE LOS USAMOS CUANDO NO NOS INTERESA CONTROLAR EL ORDEN DE EJECUCIÓN

    // Para crear un hilo:
    // - Creamos una nueva clase como el servicio que queremos que haga, implementamos Runnable o extendemos Thread
    // - Desspues implementamos el metodo run en la clase que hemos creado y lo que declaremos ahi sera lo que se ejecute
    // en concurrencia al usuar HiloEscribirNums.start(), si llamamos al .run() seria en secuencial.
    // dentro del metodo run() que añadimos a la clase podemos tratar el hilo, como por ejemplo que queremos que haga,
    // puede pintar cosas, llamar APIs...

    // Para lanzar una clase (hilo) que implemente Runnable, tendremos que hacer en el main principal un
    //TODO: ClaseSaluda s = new ClaseSaluda();
    //TODO: Thread hilosaludo = new Thread(s);
    //TODO: hilosaludo.start() -> Va a ejecutar lo que haya en en el metodo run()

    // Con una clase que extienda de Thread no hace falta:
    //TODO: ClaseExtThread cext = new ClaseExtThread()
    //TODO: cext.start() -> Va a ejecutar lo que haya en en el metodo run()

    // METODOS:
    // - hilo.join() -> si lo ponemos todolo que venga despues esperará a que finalice el hilo y despues hace el resto
    // - hilo.yield() -> Lo sacamos de la cola para que no se lance el primero pero no sabemos si sera el segundo en
    //ejecutarse o el último
    // - hilo.sleep() es para dormirlo durante X segundos
    // - hilo.wait() se usa para condicionar, por ejemplo hasta que no termine este hilo.

}
