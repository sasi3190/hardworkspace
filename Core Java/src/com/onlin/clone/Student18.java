package com.onlin.clone;

public class Student18 implements Cloneable{  
int rollno;  
String name;  
  
Student18(int rollno,String name){  
this.rollno=rollno;  
this.name=name;  
}  
  
/*public Object clone()throws CloneNotSupportedException{  
return super.clone();  
} */ 
  
public static void main(String args[]){  
try{  
Student18 s1=new Student18(101,"amit");  
Student18 s2= new Student18(103,"bbbbbmnmit");

  
Student18 s3=(Student18)s1.clone();  
Student18 s4=(Student18)s2.clone();  
  
System.out.println(s4.rollno+" "+s4.name);  
System.out.println(s3.rollno+" "+s3.name);  
  
}catch(CloneNotSupportedException c){}  
  
}  
}  