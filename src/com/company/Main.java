package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here
        Scanner s = new Scanner(new File("employees.txt"));
        ArrayList<String> list = new ArrayList<String>();

        while (s.hasNext()){
            list.add(s.nextLine());
        }
        s.close();

        System.out.println("There are " + list.size()+ " employees.");

        for (String element:list){
            System.out.println(element);
        }
    }
}
