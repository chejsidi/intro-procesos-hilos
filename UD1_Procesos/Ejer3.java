package UD1_Procesos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public class Ejer3 {

    static void main() throws IOException, InterruptedException {
        ProcessBuilder pb = new ProcessBuilder("sh", "-c", "whoami");
        Process processRun = pb.start();

/*        String txt = new String(processRun.getInputStream().readAllBytes());
        System.out.println(txt);*/
        InputStream is = processRun.getInputStream();
        BufferedReader bf = new BufferedReader(new InputStreamReader(is));

        List<String> lineas = bf.readAllLines();

        for(String linea: lineas){
            System.out.println("Salida: " + linea);
        }

    }
}
