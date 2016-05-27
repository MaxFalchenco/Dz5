package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

/**
 * Created by Максим on 24.04.2016.
 */
public class Task2 {

    public String task_2 ()
    {
        String str_for_tast_1 = "";
        String str_for_tast_1_2 = "";
        ArrayList for_numbers = new ArrayList();


        Random rnd = new Random(System.currentTimeMillis());

        File file = new File("task2_1.txt");

        try (FileOutputStream stream = new FileOutputStream(file)) {
            for (int i = 0; i < 10; i++) {
                stream.write(0 + rnd.nextInt(100 - 0 + 1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

//-----------------------------------------------------------------------------------------------------------------------

        try (FileInputStream stream = new FileInputStream(file)) {

            int symbol = 0;
            while((symbol = stream.read()) != -1)
            {
                str_for_tast_1 += " " + symbol;
                for_numbers.add(symbol);
            }



        } catch (Exception e) {
            e.printStackTrace();
        }



        Collections.sort(for_numbers);
        System.out.println("fsdfgsdfg" + for_numbers);

        Object obj = 0;

        for (int i = 0; i < for_numbers.size(); i++) {
            obj = for_numbers.get(i);
            str_for_tast_1_2 += obj.toString() + " ";
        }

        File file1 = new File("task2_2.txt");



        try (FileWriter writer = new FileWriter(file1, false))
    {
            writer.write(str_for_tast_1_2);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return str_for_tast_1_2;
    }


    public static void main(String[] args) {
        Task2 task2 = new Task2();
        System.out.println(task2.task_2());

    }
}
