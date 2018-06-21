package src;

public class BinaryTreeMain {

    public static void main(String[] args) {
        // Instancia nova árvore binária.
        BinaryTree<Integer> bt = new BinaryTree<>(10);
        // O nó raiz é inicializado dentro da árvore
        BinaryNode<Integer> root = bt.getRoot();

        // Atribui a subárvore esquerda da raiz.
        // Observe o uso da interface flúida.
        root.setLeft(new BinaryNode<>(15))
                // Atribui a subárvore direita da raiz
                .setRight(new BinaryNode<>(5))
                // Obtém a subárvore direita da raiz (ver acima)
                .getRight()
                // Atribui a subárvore esquerda
                .setLeft(new BinaryNode<>(7))
                // Atribui a subárvore direita
                .setRight(new BinaryNode<>(1));

        System.out.println("Nó raiz: " + root);
        System.out.println("Esquerda da raiz: " + root.getLeft());
        System.out.println("Direita (d) da raiz:" + root.getRight());

        System.out.println("Esquerda de (d):" + root.getRight().getLeft());
        System.out.println("Direita de (d):" + root.getRight().getRight());
    }

}
