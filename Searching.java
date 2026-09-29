/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package searching;
/**
 *
 * @author AcharyaAcademy
 */
public class Searching {

    
    public static int LinearSearch(int arr[],int key){
    for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
           }
        }
    return -1;
    }
    public static int BinarySearch(int numbers[],int key){
    int n = numbers.length;
    int low = numbers[0];
    int high = numbers[n-1];
    while(low<high){
    int mid=low+(high-low)/2;
        if(numbers[mid]==key){
        return mid;
        } 
        else if(numbers[mid]<key){
        mid++;
        }
        else{
        mid--;
        }
    }
    return -1;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int numbers[]={2,3,4,6,7,8,9};
        int key=6;
        int index = LinearSearch(numbers,key);
        if(index==-1){
        System.out.println("Index Not Found");
        }
        else{
        System.out.println("Solution is this :"+index);
        }
        int bin = BinarySearch(numbers,key);
        if(bin==-1){
        System.out.println("Index Not found");
        }
        else{
        System.out.println("Solution is :"+bin);}
    } 
}
