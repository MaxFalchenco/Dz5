package com.company;

import java.io.File;
import java.io.FileInputStream;

// read sample file
public class Main {

    public static void main(String[] args) {

        File file = new File("E:\\Progects\\Dz5\\src\\com\\company\\dz5.txt");

        // try with resource
        try (FileInputStream stream = new FileInputStream(file)) {
            String s = "";
            int symbol = 0;
            while((symbol = stream.read()) != -1) {
                s += (char) symbol;
            }
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}