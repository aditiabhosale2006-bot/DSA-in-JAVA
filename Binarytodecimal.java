/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binarytodecimal;
/**
 *
 * @author AcharyaAcademy
 */
public class Binarytodecimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        bintodec(101);
    }
    public static void bintodec(int bin){
        int num=bin;
        int power=0;
        int dec=0;
        while(bin>0){
        int last = bin%10;
        dec=dec+last*(int)Math.pow(2,power);
        power++;
        bin=bin/10;
        }
        System.out.println("BINARY TO DECIMAL OF:"+num+"="+dec);
    }
}
