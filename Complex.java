/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.complex;

/**
 *
 * @author AcharyaAcademy
 */
public class Complex {
    
    int real; 
    int imaginary; 
    Complex(int real, int imaginary) 
    { this.real = real; 
    this.imaginary = imaginary;
    }
    Complex add(Complex obj) 
    { return new Complex(real + obj.real, imaginary + obj.imaginary);
    }
    Complex subtract(Complex obj) { 
    return new Complex(real - obj.real, imaginary - obj.imaginary);
    }
    Complex multiply(Complex obj) 
    { return new Complex( real * obj.real - imaginary * obj.imaginary, real * obj.imaginary + obj.real * imaginary ); 
    }
    void display() {
        System.out.println(real + " + " + imaginary + "i"); 
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Complex c1 = new Complex(4, 5);
        Complex c2 = new Complex(4, 11); 
        Complex c3 = c1.add(c2); 
        Complex c4 = c1.subtract(c2);
        Complex c5 = c1.multiply(c2); 
        System.out.println("Addition:"); 
        c3.display(); 
        System.out.println("Subtraction:"); 
        c4.display(); 
        System.out.println("Multiplication:"); 
        c5.display();
    }
}
