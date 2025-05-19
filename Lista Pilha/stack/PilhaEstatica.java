package stack;

public class PilhaEstatica<T> {
    private T[] elementos;
    private int topo;
    private int tamanho;

    @SuppressWarnings("unchecked")
    public PilhaEstatica(int tamanho) {
        this.elementos = (T[]) new Object[tamanho];
        this.topo = -1; // pilha vazia
        this.tamanho = tamanho;
    }

    public boolean isVazia() {
        return (this.topo == -1);
    }

    public boolean isCheia() {
        return (this.topo + 1 == this.tamanho);
    }

    public int getQuantidade() {
        return this.topo + 1;
    }

    public boolean push(T elemento) {
        if (isCheia()) return false;
        elementos[++this.topo] = elemento;
        return true;
    }

    public T peek() {
        if (isVazia()) return null;
        return elementos[this.topo];
    }

    public T pop() {
        if (this.isVazia()) return null;
        return this.elementos[this.topo--];
    }

    // NOVOS MÉTODOS

    public void imprimir() {
        System.out.print("Pilha (topo -> base): ");
        for (int i = topo; i >= 0; i--) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println();
    }

    public boolean contem(T elemento) {
        for (int i = 0; i <= topo; i++) {
            if (elementos[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    public void esvaziar() {
        topo = -1;
    }

    // TESTE
    public static void main(String[] args) {
        PilhaEstatica<Integer> pilha = new PilhaEstatica<>(10);

        pilha.push(5);
        pilha.push(10);
        pilha.push(15);
        pilha.push(20);
        pilha.push(25);

        pilha.imprimir(); // Pilha: 25 20 15 10 5

        System.out.println("Contém 15? " + pilha.contem(15)); // true
        System.out.println("Contém 99? " + pilha.contem(99)); // false

        pilha.esvaziar();
        pilha.imprimir(); // Pilha vazia
    }
}