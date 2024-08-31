package application;

import java.util.Random;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];

        for(int i=0;i<10;i++){
            vetor1[i] = rnd.nextInt( 20);
            vetor2[i] = rnd.nextInt(20);
        }
        int[] vetor3 = new int[10];
        for(int i=0;i<10;i++){
            int valor = rnd.nextInt(20);
            if(vetor1[i]!=valor&&vetor2[i]!=valor){
                vetor3[i]=valor;
            }
        }

        for(int i=0;i<10;i++){
            System.out.print(" "+vetor1[i]);
        }
        System.out.println();
        for(int i=0;i<10;i++){
            System.out.print(" "+vetor2[i]);
        }
        System.out.println();
        for(int i=0;i<10;i++){
            System.out.print(vetor3[i]+" ");
        }

        sc.close();
    }
}
