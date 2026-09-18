package UD1_Procesos;

import java.io.IOException;

public class Ejer7 {
    static void main() throws IOException, InterruptedException {
        ProcessBuilder pb = new ProcessBuilder("open", "-a", "calc");

        Process processRun = pb.start();

        System.out.println("Esta vivo?: " + processRun.isAlive());
        if(processRun.isAlive()){
            processRun.waitFor();
            System.out.println("Esta vivo?: " + processRun.isAlive());
            System.out.println("Codigo de retorno: " + processRun.exitValue());
        }
    }
}
