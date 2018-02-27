package Kap16Exercise2;

import java.util.Collections;

public class Exercise2
{
    /*
    Write a method called max that returns the maximum value
    in a list of integers. If the list is empty, it should throw a NoSuchElementException
    */

    public static void main(String[] args)
    {
        LinkedIntList list = new LinkedIntList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        LinkedIntList listEmpty = new LinkedIntList();

        System.out.println(list.max(list));
        System.out.println(listEmpty.max(listEmpty));
    }
}
