package entities;

public class Calculo {
    public int valor;
    public double raiz;
    public double cubo;

    public Calculo(int valor) {
        this.valor = valor;
    }

    public double raiz(int valor) {
        valor = this.valor;
        raiz = Math.sqrt(valor);
        return raiz;
    }

    public double cubo(int valor) {
        valor = this.valor;
        cubo = Math.pow(valor, 3);
        return cubo;
    }

    public String toString() {
        return String.format("valor: %d raiz: %.2f cubo: %.2f", valor, raiz(valor), cubo(valor));
    }
}