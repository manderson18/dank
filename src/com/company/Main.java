package com.company;

import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sf = new Scanner(new File("NerdData.txt"));
        int text = -1;
        String txt[] = new String[1000];
        while(sf.hasNext()){

            String w = sf.nextLine();
            text++;
            if(w.substring(0, 1).equalsIgnoreCase("T")) {

                System.out.println(w);

            }

        }



    }
}
