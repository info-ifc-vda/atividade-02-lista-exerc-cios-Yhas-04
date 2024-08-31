package application;

import entities.Contas;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] cod = new int[10];
        double[] saldo = new double[10];
        int op;
        Contas[] conta = new Contas[10];
        for(int i=0;i<conta.length;i++){
            cod[i]=i;
            System.out.println("insira o valor para a conta com o codigo: "+cod[i]);
            saldo[i] = sc.nextDouble();
            conta[i] = new Contas(saldo[i], cod[i]);
        }

        do{
            System.out.println("Qual a opção:");
            System.out.println("1-Deposito");
            System.out.println("2-Saque");
            System.out.println("3-Consultar saldo");
            System.out.println("4-Finalizar");
            op = sc.nextInt();
            if(op!=4) {
                System.out.println("Informe o codigo da conta: ");
                int opMenu = sc.nextInt();
                if (op == 1) {
                    System.out.println("Insira o valor do deposito:");
                    double dep = sc.nextDouble();
                    conta[opMenu].deposito(opMenu, dep);
                } else if (op == 2) {
                    System.out.println("Insira o valor do saque:");
                    double saque = sc.nextDouble();
                    conta[opMenu].saque(opMenu, saque);
                } else if (op == 3) {
                    System.out.println(conta[opMenu].toString(opMenu));
                } else {
                    System.out.println("Opção invalida!");
                }
            }
        }while(op!=4);

        sc.close();
    }
}
