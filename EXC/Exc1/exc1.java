import java.util.Scanner;

public class exc1 {

    public static void main(String[] args) {
             Scanner in=new Scanner(System.in);

	/*1. Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou zero.*/


     int num1;
 

     System.out.println("digite um numero");
         num1=in.nextInt();

     if(num1>0) {


         System.out.println("o numero e maior que zero");

     }else if(num1<0) {


       System.out.println("o numero e menor que zero");

     }else {


         System.out.println("o numero digitado foi zero");
     }
 


    }

}