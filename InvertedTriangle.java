package Letcode;

import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        int step;
        Scanner sc=new Scanner(System.in);
        System.out.println("Basamak sayısını girin: ");
        step=sc.nextInt();

        for(int i=0; i<step; i++){
           for(int m=step; m>step-i; m--){
               System.out.print(" ");
           }
            for(int k=0; k<(2*step-1)-2*i; k++){
                System.out.print("*");


            }

            System.out.println();
        }
    }
}
