/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.solutions;
import java.util.*;
/**
 *
 * @author AcharyaAcademy
 */
public class Solutions {

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        boolean isPrime = true;
        if(n==2){
            System.out.println("2 is prime no");
        }
        else{
        for(int i=2;i<=n-1;i++){
            if(n%2==0){
                isPrime = false;
            }
        }
    }
        if(isPrime==true){
        System.out.println(n+"is Prime");
        }
        else{
        System.out.println(n+"is not Prime");
        }
    }
}
