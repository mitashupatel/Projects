package Mitashu.interview.programs;
import java.util.*;
public class FirstQue {

 static char firstRepeating(char str[]) 
 { 
     
     HashSet<Character> h = new HashSet<>(); 

     
     for (int i=0; i<=str.length-1; i++) 
     { 
         char c = str[i]; 

        
         if (h.contains(c)) 
             return c; 

         else 
             h.add(c); 
     } 

     return '\0'; 
 } 

 public static void main (String[] args) 
 { 
     String str = "mitashupatel"; 
     char[] arr = str.toCharArray(); 
     System.out.println(firstRepeating(arr)); 
 } 
}