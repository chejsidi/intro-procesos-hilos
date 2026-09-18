package UD1_Procesos;

import java.io.IOException;

public class Ejer2 {

    static void main() throws IOException {
        ProcessBuilder pb = new ProcessBuilder("sh", "-c", "whoami");
        pb.inheritIO();
        Process processRun = pb.start();

    }

}
