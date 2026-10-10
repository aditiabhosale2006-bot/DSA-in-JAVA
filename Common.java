/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package common;
import java.util.*;
/**
 *
 * @author AcharyaAcademy
 */
public class Common {

    
    public static boolean isPalindrome(String str){
          int n=str.length();
          for(int i=0;i<n/2;i++){
          if(str.charAt(i)!=str.charAt(n-i-1)){
              return false;
          }
        }
    
            return true;
    }
    /*Given a route containing 4 directions.find shortest path to reach destination*/
    public static double getshortestpath(String path){
        double x=0,y=0;
        for(int i=0;i<path.length();i++){
        char dir = path.charAt(i);
        
        if(dir == 'W'){
            x--;
            }
        else if(dir == 'E'){
            x++;
            }
        else if(dir == 'N'){
            y++;
            }
        else{
            y--;
        }
        }
        return (Math.sqrt(x*x+y*y));
    }
    
    public static String Uppercase(String str){
    StringBuilder sb = new StringBuilder("");
    char ch = Character.toUpperCase(str.charAt(0));
    sb.append(ch);
    for(int i=1;i<str.length();i++){
        if(str.charAt(i)==' ' && i<str.length()-1){
            sb.append(str.charAt(i));
            i++;
            sb.append(Character.toUpperCase(str.charAt(i)));
        }
        else{
        sb.append(str.charAt(i));
        }
    }
    return sb.toString();
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        //check if it is a palindrome or not
        String str = "racecar";
        System.out.println("racecar :"+isPalindrome(str));
        System.out.println(str.substring(0,5));
        String str2 = "aditi";
        System.out.println("aditi :"+isPalindrome(str2));  
        //shortest path
        String abc="WNNESE";
        System.out.println((int) getshortestpath(abc));
        
        //largest string from array of strings
        String fruits[] = {"apple","banana","cherry"};
        String largest = fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
            largest=fruits[i];
            }
        }
        System.out.println(largest);
        
        //Uppercase in string
        
       System.out.println(Uppercase("hello aditi how are you?"));
    }
    
}
