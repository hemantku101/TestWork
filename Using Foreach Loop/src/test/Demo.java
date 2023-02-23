package test;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	 public static void main(String[] args) {  
         
	        List<String> list=new ArrayList<String>();  
	        list.add("Patrapur");  
	        list.add("Samantiapalli");  
	        list.add("Jarada");  
	        list.add("Berhampur");  
	          
	        list.forEach(  (n)->System.out.println(n)  );  
	    }  
}