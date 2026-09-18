package UD1_Procesos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ejer4 {

    static void main() throws IOException, InterruptedException {
        ProcessBuilder pb = new ProcessBuilder("sh", "-c", "ls");


        //Process processRun = pb.start();
        Process runtime = Runtime.getRuntime().exec("sh -c ls");

        System.out.println("Esta vivo? " + runtime.isAlive());
        runtime.waitFor();
        System.out.println("Esta vivo? " + runtime.isAlive());

        String result = new String(runtime.getInputStream().readAllBytes());
        System.out.println("Result: " + result);
        FileWriter fw = new FileWriter(new File("resultEjer4.txt"));
        fw.write(result);
        fw.close();


    }
}
