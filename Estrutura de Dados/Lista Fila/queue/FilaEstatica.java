package queue;

public class FilaEstatica<T> {
    private T[] elementos;
    private int inicio;
    private int fim;
    private int tamanho;

    @SuppressWarnings("unchecked")
    public FilaEstatica(int tamanho) {
        this.elementos = (T[]) new Object[tamanho];
        this.inicio = this.fim = 0;
        this.tamanho = tamanho;
    }

    public boolean isVazia() {
        return this.inicio == this.fim;
    }

    public boolean isCheia() {
        return this.fim == this.tamanho;
    }

    public int getQuantidade() {
        return this.fim - this.inicio;
    }

    public boolean enqueue(T elemento) {
        if (isCheia()) {
            return false;
        }
        elementos[this.fim] = elemento;
        this.fim++;
        return true;
    }

    public T dequeue() {
        if (isVazia()) {
            return null;
        }
        T elemento = elementos[this.inicio];

        for (int i = this.inicio; i < this.fim - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        this.fim--;
        return elemento;
    }

    // NOVOS MÉTODOS

    // Imprime os elementos da fila
    public void imprimir() {
        if (isVazia()) {
            System.out.println("Fila vazia.");
            return;
        }
        for (int i = inicio; i < fim; i++) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println();
    }

    // Verifica se um elemento está presente na fila
    public boolean contem(T elemento) {
        for (int i = inicio; i < fim; i++) {
            if (elementos[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    // Esvazia a fila
    public void esvaziar() {
        this.inicio = 0;
        this.fim = 0;
    }

    public static void main(String[] args) {
        FilaEstatica<Integer> fila = new FilaEstatica<>(10);

        fila.enqueue(5);
        fila.enqueue(10);
        fila.enqueue(15);
        fila.enqueue(20);
        fila.enqueue(25);

        System.out.println("Elementos da fila:");
        fila.imprimir();

        System.out.println("A fila contém 15? " + fila.contem(15));
        System.out.println("A fila contém 99? " + fila.contem(99));

        fila.esvaziar();
        System.out.println("Fila após esvaziar:");
        fila.imprimir();
        System.out.println("Tamanho da fila: " + fila.getQuantidade());
    }
}