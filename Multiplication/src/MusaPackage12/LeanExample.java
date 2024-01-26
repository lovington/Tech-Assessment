package MusaPackage12;


import java.util.Scanner;

public class LeanExample {
    public static boolean has_three(int x, int y) {
         int sum;
         if(x==3 && y==3)

             System.out.println("True ");
         else
             System.out.println("False");
        return false;
    }

    public static void main(String[] args) {
        System.out.println("enter x");
        Scanner input =new Scanner(System.in);
        int x=input.nextInt();

        System.out.println("Enter y");
        int y=input.nextInt();

        System.out.println(has_three(x,y));
    }
}
