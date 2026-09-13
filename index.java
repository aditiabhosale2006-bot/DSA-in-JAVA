import java.util.*;
public class index{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a");
        int a = sc.nextInt();
        System.out.println("Enter thr number b");
        int b = sc.nextInt();
        System.out.println("Enter the number c");
        int c = sc.nextInt();
        sc.close();
        if(a>b && a>c){
            System.out.println("a is greater than b and c");
        }
        else if(b>c){
            System.out.println("b is greater than a and c");
        }
        else{
            System.out.println("c is greater than a and b");
        }
    }
}