package stack;

public class PilhaEncadeada<T> {
    private class No {
        T elemento;
        No proximo;

        public No(T elemento) {
            this.elemento = elemento;
            this.proximo = null;
        }
    }

    private No topo;

    public PilhaEncadeada() {
        this.topo = null; // pilha vazia
    }

    public boolean isVazia() {
        return topo == null;
    }

    public int getQuantidade() {
        int count = 0;
        No atual = topo;
        while (atual != null) {
            count++;
            atual = atual.proximo;
        }
        return count;
    }

    public void push(T elemento) {
        No novoNo = new No(elemento);
        novoNo.proximo = topo;
        topo = novoNo;
    }

    public T peek() {
        if (isVazia()) return null;
        return topo.elemento;
    }

    public T pop() {
        if (isVazia()) return null;
        T elemento = topo.elemento;
        topo = topo.proximo;
        return elemento;
    }


    public void imprimir() {
        if (isVazia()) {
            System.out.println("Pilha vazia.");
            return;
        }
        System.out.print("Pilha (topo -> base): ");
        No atual = topo;
        while (atual != null) {
            System.out.print(atual.elemento + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public boolean contem(T elemento) {
        No atual = topo;
        while (atual != null) {
            if (atual.elemento.equals(elemento)) {
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }

    public void esvaziar() {
        topo = null;
    }

    public static void main(String[] args) {
        PilhaEncadeada<Integer> pilha = new PilhaEncadeada<>();

        pilha.push(5);
        pilha.push(10);
        pilha.push(15);
        pilha.push(20);
        pilha.push(25);

        pilha.imprimir();

        System.out.println("Contém 15? " + pilha.contem(15));
        System.out.println("Contém 99? " + pilha.contem(99));

        pilha.esvaziar();
        pilha.imprimir();
    }
}
