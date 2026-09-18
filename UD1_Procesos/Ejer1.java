package UD1_Procesos;

import java.io.IOException;

public class Ejer1 {

    static void main() throws IOException, InterruptedException {
        ProcessBuilder pb = new ProcessBuilder("open", "-a", "Calculator");
        Process processRun = pb.start();
        if(processRun.isAlive()){
            System.out.println("El proceso esta vivo");
            System.out.println("Pid: " + processRun.pid());
            System.out.println("Info: " + processRun.info() );
            Thread.sleep(6000);
            processRun.destroyForcibly();
            System.out.println("Sigue vivo? " + processRun.isAlive());
        }
    }

}
