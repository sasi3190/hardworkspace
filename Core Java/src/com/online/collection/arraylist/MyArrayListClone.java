package com.online.collection.arraylist;

import java.util.ArrayList;

public class MyArrayListClone {
 
    public static void main(String a[]){
        ArrayList<String> arrl = new ArrayList<String>();
        //adding elements to the end
        arrl.add("My");
        arrl.add("Life");
        arrl.add("My");
        arrl.add("Rules");
        System.out.println("Actual ArrayList:"+arrl);
        ArrayList<String> copy = (ArrayList<String>) arrl.clone();
        System.out.println("Cloned ArrayList:"+copy);
    }
}
