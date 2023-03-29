import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //Inserção dos números na lista
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        
        //Remoção dos dados da lista e inserção na pilha
        Stack<Integer> pilha = new Stack<>();
        while (!lista.isEmpty()) {
            pilha.push(lista.removeFirst());
        }
        
        //Remoção dos dados da pilha e inserção na fila
        Queue<Integer> fila = new LinkedList<>();
        while (!pilha.isEmpty()) {
            fila.add(pilha.pop());
        }
        
        //Inserção dos números na lista
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(9);
        lista.add(10);
        
        //Repetição dos passos 2 e 3
        while (!lista.isEmpty()) {
            while (!lista.isEmpty()) {
                pilha.push(lista.removeFirst());
            }
            while (!pilha.isEmpty()) {
                fila.add(pilha.pop());
            }
        }
        
        //Exibição dos números inseridos na fila
        while (!fila.isEmpty()) {
            System.out.print(fila.remove() + " ");
        }
    }
}
