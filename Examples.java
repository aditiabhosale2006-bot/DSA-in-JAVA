/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examples;
import java.util.*;
/**
 *
 * @author AcharyaAcademy
 */
public class Examples {
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
        fact=fact*i;
        }
        return fact;
    }
    public static int bin(int n,int r){
        int a = factorial(n);
        int b = factorial(r);
        int c =  factorial(n-r);
        return a/(b*c);
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int res = bin(5,2);
        System.out.println("Binomial coeficient of 5,2 is"+res);
    }
}
