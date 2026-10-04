/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sorting;
import java.util.*;
/**
 *
 * @author AcharyaAcademy
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void bubble(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                }
            }
        }
    }
    
    public static void selection(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
               if(arr[minpos]>arr[j]){
                   minpos=j;
               }
            }
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void insertionsort(int arr[]){
        for(int i=1;i<arr.length;i++){
        int curr=arr[i];
        int prev=i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }
    
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // TODO code application logic here
         int arr[]={4,5,2,3,8};
         bubble(arr);
         System.out.println("Bubble Sort: ");
         printarr(arr);  
         selection(arr);
         System.out.println("Selection Sort: ");
         printarr(arr);
         System.out.println("Insertion  Sort: ");
         printarr(arr);
        }
}
