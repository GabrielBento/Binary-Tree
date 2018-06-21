package src;

public class BinarySearchTree<T extends Comparable> extends BinaryTree<T> {

    public BinarySearchTree(T val) {
        super(val);
    }

    public BinarySearchTree() {
    }

    public BinaryNode<T> add(T val) {
        // Inicializa novo nó que contém o valor a ser adicionado.
        BinaryNode<T> newNode = new BinaryNode<>(val);
        // Se a árvore está vazia, o novo nó torna-se a raiz.
        if (root == null) {
            root = newNode;
            return newNode;
        }

        /*
         * Algoritmo para percorrer a árvore à procura do local para adicionar o
         * novo nó (newNode).
         */
        BinaryNode<T> n = root;

        while (true) {
            // Se val < n.getValue()
            if (val.compareTo(n.getValue()) < 0) {
                // Se houver uma subárvore pela esquerda, desce por ela
                if (n.getLeft() != null) {
                    n = n.getLeft();
                } else {
                    // Caso contrário este é o local adequado para o novo nó
                    return n.setLeft(new BinaryNode<>(val));
                }
                // Se houver uma subárvore pela direita, desce por ela
            } else if (n.getRight() != null) {
                n = n.getRight();
            } else {
                // Caso contrário este é o local adequado para o novo nó
                return n.setRight(new BinaryNode<>(val));
            }
        }
    }

    /*
     * Retorna true se o valor val está presente na árvore ou falso caso
     * contrário
     */
    public boolean contains(T val) {
        // inicia a busca pela raiz da árvore
        BinaryNode<T> n = getRoot();
        // a busca segue enquanto null não tiver sido atingido
        while (n != null) {
            // o valor no BinaryNode n é comparado com o argumento val
            int c = n.getValue().compareTo(val);
            // se o resultado da comparação é 0 então eles são iguais
            if (c == 0) {
                return true;
                // se c é positivo então o valor no n é maior que val
                // a busca deve continuar pela esquerda
            } else if (c > 0) {
                n = n.getLeft();
                // caso contrário continua pela direita
            } else {
                n = n.getRight();
            }
        }
        // valor não encontrado
        return false;
    }
}
