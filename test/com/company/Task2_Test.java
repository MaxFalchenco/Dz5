package com.company;


import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by ������ on 14.05.2016.
 */
public class Task2_Test {

    com.company.Task3 task3 = new com.company.Task3();

    @Test
    public  void checkedIntTest(){
        String str = "Hello, this is number 24";
        Assert.assertEquals(task3.checkString_int(str), true);

    }
}
