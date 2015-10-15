package collection.list.set;

import java.util.HashSet;

public class MyBasicHashSet {
 
    public static void main(String a[]){
    	//Initializing the HashSet
        HashSet<String> hs = new HashSet<String>();
        //add elements to HashSet
        hs.add("first");
        hs.add("second");
        hs.add("third");
        System.out.println(hs);
        //Checking whether the hashSet element is empty or not
        System.out.println("Is HashSet empty? "+hs.isEmpty());
        //Remove an element from the Hashset
        hs.remove("third");
        System.out.println(hs);
        //Check the size of the hashset
        System.out.println("Size of the HashSet: "+hs.size());
        //Check the given element is present in the Hashset 
        System.out.println("Does HashSet contains first element? "+hs.contains("first"));
        
        HashSet<Integer> hs1 = new HashSet<Integer>();
        hs1.add(144444);
        hs1.add(5444);
        hs1.add(3666);
        hs1.add(4444);
        hs1.add(441);
        hs1.add(2555);
        System.out.println(hs1);
        
    }
}
