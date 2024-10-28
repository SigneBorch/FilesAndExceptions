
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class Race {
    public static void main(String[] args) {
        File moby = new File("MobyDick.txt");
        //Her laver vi en Scanner der læser fra en fil
        Scanner scan = new Scanner(moby);
        List<String> ord = new ArrayList<String>();
        //Vi tager tid
        long startTid = System.currentTimeMillis();
        //Klar, parat, SCAN!!
        while (scan.hasNext()) {
            ord.add(scan.nextLine());
        }
        long slutTid = System.currentTimeMillis();
        long køretid = slutTid - startTid;
        System.out.println("Scanneren tog " + køretid + " millisekunder.");
        System.out.println("ArrayListen indeholder nu " + ord.size() + " ord.");
        //ArrayListen tømmes så den er klar til brug igen
        ord.clear();
        //Så er det BufferedReaders tur!
        BufferedReader buffered = new BufferedReader(new FileReader(moby));
        startTid = System.currentTimeMillis();
        while (buffered.ready()) {
            ord.add(buffered.readLine());
        }
        slutTid = System.currentTimeMillis();
        køretid = slutTid - startTid;
        System.out.println("BufferedReader var " + køretid + " millisekunder om det.");
    }
}
