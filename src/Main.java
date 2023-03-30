import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>();
        Stack<Integer> pilha = new Stack<>();
        Queue<Integer> fila = new LinkedList<>();
        
        // Passo 1: Insere números na lista
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        
        // Passo 2: Remove dados da lista e insere na pilha
        while (!lista.isEmpty()) {
            pilha.push(lista.removeFirst());
        }
        
        // Passo 3: Remove dados da pilha e insere na fila
        while (!pilha.isEmpty()) {
            fila.add(pilha.pop());
        }
        
        // Passo 4: Insere novos números na lista
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(9);
        lista.add(10);
        
        // Passo 5: Repete passos 2 e 3
        while (!pilha.isEmpty()) {
            fila.add(pilha.pop());
        }
        
        
        while (!pilha.isEmpty()) {
            fila.add(pilha.pop());
        }
        
        // Passo 6: Exibe os números na fila
        while (!fila.isEmpty()) {
            System.out.println(fila.remove());
        }
    }

}
