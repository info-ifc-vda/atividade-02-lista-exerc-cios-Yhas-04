package application;

import entities.Calculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        List<Calculo> calculos = new ArrayList<>();
        int valor;
        Scanner sc = new Scanner (System.in);
        do{
            System.out.println("Insira os valores- 0 ou negativo para finalizar:");
            valor = sc.nextInt();
            if(valor>0) {
                Calculo calculo = new Calculo(valor);
                calculos.add(calculo);
            }
        }while(valor > 0);

        for(Calculo print : calculos){
            System.out.println(print);
        }

        sc.close();

    }

}