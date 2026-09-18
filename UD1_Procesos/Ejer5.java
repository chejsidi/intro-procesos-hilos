package UD1_Procesos;

import java.io.File;
import java.io.IOException;

public class Ejer5 {

    static void main() throws IOException {
        ProcessBuilder pb = new ProcessBuilder("sh", "-c", "ls");
        System.out.println(pb.directory());
        // Configuramos primero
        File directorio = new File("/Users/chej/developer/school/test");
        pb.directory(directorio);
        System.out.println("Se encuentra en "+ pb.directory());


        // Ejecutamos
        Process processRun = pb.start();

    }
}
