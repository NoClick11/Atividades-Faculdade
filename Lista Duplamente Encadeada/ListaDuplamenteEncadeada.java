/*
Aluno 1: Manuel  Bahamonde Boulhosa Neto, Matricula: 200031998
Aluno 2: Evelyn Pereira dos Santos Cupertino, Matricula: 200032073
 */
public class ListaDuplamenteEncadeada {
    private static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public ListaDuplamenteEncadeada() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public boolean contains(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Lista vazia.");
            return;
        }
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    public Integer removeFirst() {
        if (isEmpty()) {
            return null;
        }
        int data = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return data;
    }

    public Integer removeLast() {
        if (isEmpty()) {
            return null;
        }
        int data = tail.data;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        return data;
    }

    public Integer getFirst() {
        if (isEmpty()) {
            return null;
        }
        return head.data;
    }

    public Integer getLast() {
        if (isEmpty()) {
            return null;
        }
        return tail.data;
    }

    public Integer findFirstDuplicate() {
        Node current = head;
        while (current != null) {
            Node checker = current.next;
            while (checker != null) {
                if (current.data == checker.data) {
                    return current.data;
                }
                checker = checker.next;
            }
            current = current.next;
        }
        return null;
    }

    public void append(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public static void main(String[] args) {
        ListaDuplamenteEncadeada dll = new ListaDuplamenteEncadeada();

        System.out.println("Lista está vazia: " + dll.isEmpty());  // true
        System.out.println("Tamanho da lista: " + dll.getSize());  // 0
        System.out.println("Contém 10: " + dll.contains(10));  // false
        System.out.println("Primeiro elemento: " + dll.getFirst());  // null
        System.out.println("Último elemento: " + dll.getLast());  // null
        System.out.println("Primeiro duplicado: " + dll.findFirstDuplicate());  // null

        dll.append(10);
        dll.append(20);
        dll.append(30);
        dll.append(10);

        System.out.println("Lista está vazia: " + dll.isEmpty());  // false
        System.out.println("Tamanho da lista: " + dll.getSize());  // 4
        System.out.println("Contém 20: " + dll.contains(20));  // true
        System.out.println("Primeiro elemento: " + dll.getFirst());  // 10
        System.out.println("Último elemento: " + dll.getLast());  // 10
        System.out.println("Primeiro duplicado: " + dll.findFirstDuplicate());  // 10

        System.out.println("Remover primeiro: " + dll.removeFirst());  // 10
        System.out.println("Remover último: " + dll.removeLast());  // 10
        System.out.println("Tamanho da lista após remoções: " + dll.getSize());  // 2

        System.out.print("Lista na ordem reversa: ");
        dll.printReverse();  // 20 10
    }
}
