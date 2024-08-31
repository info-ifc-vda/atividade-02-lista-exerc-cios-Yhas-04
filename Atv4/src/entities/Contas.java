package entities;

public class Contas {
    private int[] cod = new int[10];
    private double[] saldo = new double[10];

    public Contas(double saldo, int cod) {
        for(int i=0;i<10;i++) {
            this.saldo[i] = saldo;
            this.cod[i] = cod;
        }
        }

    public void deposito(int opMenu, double dep){
        saldo[opMenu]+=dep;
    }
    public void saque(int opMenu, double saque){
        saldo[opMenu]-=saque;
    }
    public String toString(int opMenu){
        return "O codigo da conta é: " +
                cod[opMenu] +
                " O saldo é:" +
                saldo[opMenu];
    }
}
