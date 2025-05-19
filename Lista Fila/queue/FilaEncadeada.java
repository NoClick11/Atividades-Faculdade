package queue;

public class FilaEncadeada<T> {
    // Classe interna para representar os nós da fila
    private class No<T> {
        T elemento;
        No<T> proximo;

        public No(T elemento) {
            this.elemento = elemento;
            this.proximo = null;
        }
    }

    private No<T> inicio;
    private No<T> fim;
    private int tamanho;

    public T peek() {
        if (isVazia()) {
            return null;
        }
        return this.inicio.elemento;
    }

    private boolean isVazia() {
        return this.inicio == null;
    }

    public int getQuantidade() {
        return this.tamanho;
    }

    public void enqueue(T elemento) {
        No<T> no = new No<>(elemento);
        if (isVazia()) {
            this.inicio = no;
        } else {
            this.fim.proximo = no;
        }
        this.fim = no;
        this.tamanho++;
    }

    public T dequeue() {
        if (isVazia()) {
            return null;
        }
        T elementoRemovido = this.inicio.elemento;
        this.inicio = this.inicio.proximo;
        if (this.inicio == null) {
            this.fim = null;
        }
        this.tamanho--;
        return elementoRemovido;
    }

    // Imprime os elementos da fila
    public void imprimir() {
        No<T> atual = this.inicio;
        while (atual != null) {
            System.out.print(atual.elemento + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    // Verifica se a fila contém um determinado elemento
    public boolean contem(T elemento) {
        No<T> atual = this.inicio;
        while (atual != null) {
            if (atual.elemento.equals(elemento)) {
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }

    public void esvaziar() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public static void main(String[] args) {
        FilaEncadeada<Integer> fila = new FilaEncadeada<>();

        // Adiciona 5 elementos à fila
        fila.enqueue(10);
        fila.enqueue(20);
        fila.enqueue(30);
        fila.enqueue(40);
        fila.enqueue(50);

        System.out.println("Elementos da fila:");
        fila.imprimir();

        System.out.println("A fila contém 30? " + fila.contem(30));
        System.out.println("A fila contém 99? " + fila.contem(99));

        fila.esvaziar();
        System.out.println("Fila após esvaziar:");
        fila.imprimir();
        System.out.println("Tamanho da fila: " + fila.getQuantidade());
    }
}
