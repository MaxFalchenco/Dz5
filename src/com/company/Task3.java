package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;


public class Task3
{

    public boolean checkString_int(String string) {
        try {
            Integer.parseInt(string);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean checkString_char(String string) {

            int number = 0;

            if(string.length() == 1)
            {
                char cha = string.charAt(0);
                 number = (int) cha;
            }

            for (int i = 33; i <= 47; i++)
            {

                if(number == i)
                    return true;
            }

            for (int i = 58; i <= 126; i++)
            {

                 if(number == i)
                 return true;
            }

            return false;

    }

    public boolean checkString_string(String string) {

        if(string.length() >= 2  && !checkString_int(string)  && !checkString_double(string) )
        {
            return true;
        }

        return false;

    }

    public boolean checkString_double(String string) {
        try {
            if (checkString_int(string))
                return false;
            Double.parseDouble(string);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public String task_3 ()
    {

        int i = 0;
        String type = "";
        String str_for_tast_1 = "";
        String str1_for_tast_1 = "";

        File file = new File("E:\\Progects\\Dz5\\src\\com\\company\\dz5_2.txt");


        try (FileInputStream stream = new FileInputStream(file)) {

            int symbol = 0;
            while((symbol = stream.read()) != -1)
            {
                str_for_tast_1 += (char) symbol ;
            }



        } catch (Exception e) {
            e.printStackTrace();
        }

        String[] s = str_for_tast_1.split(" ");   //???? ?? ?????



        Scanner sc = new Scanner(System.in);
        type = sc.nextLine();



        if (type.equals("int") )
        {
            for (i = 0; i < s.length; i++)
            {

                if(checkString_int(s[i]))
                {
                    System.out.println("int - " + s[i]);
                }


            }
        }

        if (type.equals("char") )
        {
            for (i = 0; i < s.length; i++)
            {

                if(checkString_char(s[i]))
                {
                    System.out.println("char - " + s[i]);
                }


            }
        }

        if (type.equals("string") )
        {
            for (i = 0; i < s.length; i++)
            {

                if(checkString_string(s[i]))
                {
                    System.out.println("string - " + s[i]);
                }


            }
        }

        if (type.equals("double") )
        {
            for (i = 0; i < s.length; i++)
            {

                if(checkString_double(s[i]))
                {
                    System.out.println("double - " + s[i]);
                }


            }
        }

        return str_for_tast_1;
    }

    public static void main(String[] args) {

        Task3 task3 = new Task3();
        System.out.println(task3.task_3());



     /*   int number = 0;
String string = "ah";

            char cha = string.charAt(0);
            number = (int) cha;

        System.out.println("fhgdhdh " + number);*/

    }
}
