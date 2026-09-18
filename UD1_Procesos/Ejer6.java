package UD1_Procesos;

import java.io.File;
import java.io.IOException;

public class Ejer6 {

    static void main() throws IOException {
        ProcessBuilder pb = new ProcessBuilder("sh", "-c", "lsxd");
        pb.redirectError(new File("error.txt"));
        Process processRun = pb.start();

        if(processRun.exitValue() != 0){
    /*        String error = new String(processRun.getErrorStream().readAllBytes());
            System.out.println("ERROR: " + error);
            System.out.println("guardando..");
            FileWriter fw = new FileWriter(new File("error.txt"));
            fw.write(error);
            fw.close();*/
        }

    }
}
