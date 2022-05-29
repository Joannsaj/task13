package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task3 {

    public static void main(String[] args) throws FileNotFoundException {
        // write your code here
        Scanner sn = new Scanner(new File("employees.txt"));
        HashSet<String> list = new HashSet<String>();

        while (sn.hasNext()) {
            list.add(sn.nextLine());
        }
        System.out.println("There are " + list.size()+ " employees.");
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()){
            String element = iter.next();
            System.out.println(element);
        }

        System.out.println(list.contains("Joan Nansamba"));

    }
}
