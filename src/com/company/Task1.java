package com.company;

import java.io.*;

/**
 * Created by Максим on 24.04.2016.
 */
public class Task1
{

    public String task_1 ()
    {
        int i = 0;
        String str_for_tast_1 = "";
        String str1_for_tast_1 = "";

        File file = new File("E:\\Progects\\Dz5\\src\\com\\company\\dz5.txt");


        try (FileInputStream stream = new FileInputStream(file)) {

            int symbol = 0;
            while((symbol = stream.read()) != -1)
            {
                str_for_tast_1 += (char) symbol;
            }



        } catch (Exception e) {
            e.printStackTrace();
        }

        String[] s = str_for_tast_1.split(" ");   //бить на слова


        for (i = 0; i < s.length; i++)
        {

            if(s[i].length() > 2)
             {
                 str1_for_tast_1 += " " + s[i].toUpperCase();
             }
            else
                str1_for_tast_1 += " " + s[i];

        }


        return str1_for_tast_1;
    }


    public static void main(String[] args) {
        Task1 workFils = new Task1();
        System.out.println(workFils.task_1());
    }
}
