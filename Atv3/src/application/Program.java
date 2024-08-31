package application;

import java.util.Random;

public class Program {
    public static void main(String[] args){
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[5];
        int[] vetor3 = new int[10];
        int[] vetor4 = new int[10];
        Random rnd = new Random();

        for(int i=0;i<10;i++){
            vetor1[i] = rnd.nextInt( 1,20);
        }
        for(int i=0;i<5;i++) {
            vetor2[i] = rnd.nextInt(1,20);
        }
        for(int i=0; i<10; i++){
            if(vetor1[i]%2==0){
                vetor3[i] = vetor1[i];
            }else if(vetor1[i]%2!=0){
                vetor4[i]=vetor1[i];
            }
        }
        int cont=0;
        for(int i=0; i<10;i++){
            for(int j=0;j<5;j++){
                if(vetor3[i]!=0) {
                    vetor3[i] += vetor2[j];
                }
                if(vetor4[i]!=0&&vetor4[i]%vetor2[j]==0){
                    cont++;
                }
            }
            vetor4[i]=cont;
            cont=0;
        }


        for(int i=0;i<10;i++){
            System.out.print(" "+vetor1[i]);
        }
        System.out.println();
        for(int i=0;i<5;i++){
            System.out.print(" "+vetor2[i]);
        }
        System.out.println();
        System.out.println("Primeira bolinha:");
        for(int i=0;i<10;i++){
            System.out.print(" "+vetor3[i]);
        }
        System.out.println();
        System.out.println("Segunda bolinha:");
        for(int i=0;i<10;i++){
            System.out.print(" "+vetor4[i]);
        }
    }
}
