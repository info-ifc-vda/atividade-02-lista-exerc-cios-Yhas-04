package application;

public class Program {
    public static void main(String[] args) {
        int[][] matriz = new int[7][7];
        int[] vect1 = new int[7];
        int[] vect2 = new int[7];
        int maior=0;
        int menor=99;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (i+j)*2;
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[ " + matriz[i][j] + " ]");
            }
            System.out.println();
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j]>maior) {
                    vect1[i] = matriz[i][j];
                }
            }
        }
        for(int i=0;i<7;i++){
            System.out.print("["+vect1[i]+"]");
        }
        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[j][i]<menor) {
                    menor = matriz[j][i];
                    vect2[i] = menor;
                }
            }
            menor = 99;
        }
        for(int i=0;i<7;i++){
            System.out.print("["+vect2[i]+"]");
        }

    }
}