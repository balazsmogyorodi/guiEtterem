package main;

import modell.Etel;
import etterem.Etterem;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import modell.Menu;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        File file = new File("etlap.txt");
        Scanner myReader = new Scanner(file);
        int index = 0;
        while (myReader.hasNextLine()) {
             String data = myReader.nextLine();
            if (index > 0) {      
                new Etel(data);
            } else {
                
            }
            index ++;
        }
        String[] etelek = {"Bab", "banán"};
        int[] etelek_ara = {1200, 1400};
        System.out.println(etelek[0]);

    }

}
