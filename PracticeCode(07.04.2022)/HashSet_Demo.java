package handsOn;

import java.util.HashSet;

public class HashSet_Demo {
	public static void main(String[] args) {
		//Creating hashSet  
		HashSet<String> hashSet = new HashSet<String>();
		//Adding elements to hash set  using add() method
		hashSet.add("Ramya");   
		hashSet.add("Vijay");  
		hashSet.add("Arun");    
		hashSet.add("Suja");   
		hashSet.add("Riya");   
        //Printing the HashSet elements  
        System.out.println("Hash set Elements: "+ hashSet);  
        //Checking for "Arun" in the set  
      System.out.println("Does the HashSet contains 'Arun'? :- "+hashSet.contains("Arun"));      
      //Checking if the Set contains "123"  
      System.out.println("Does the HashSet contains '123'? :- "+hashSet.contains(123));  
      }    
}    
	