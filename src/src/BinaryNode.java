package src;

public class BinaryNode<T> {

    /*
     * Cada Nó de Árvore Binária tem um pai (parent) e outras duas subárvores:
     * esquerda (left) e direita (right).
     */
    private BinaryNode<T> parent, left, right;

    // Valor armazenado neste Nó.
    private T value;

    public BinaryNode(T v) {
        value = v;
    }

    // --- Getters e setters ---
    public T getValue() {
        return value;
    }

    /*
     * Retornar this ao final deste método ajuda no encadeamento de instruções.
     * Também chamado de "interface fluida". Ver exemplos na classe
     * BinaryTreeMain.
     */
    public BinaryNode<T> setValue(T v) {
        value = v;
        return this;
    }

    public BinaryNode<T> getParent() {
        return parent;
    }

    public BinaryNode<T> setParent(BinaryNode<T> parent) {
        this.parent = parent;
        return this;
    }

    public BinaryNode<T> setLeft(BinaryNode<T> left) {
        this.left = left;
        left.parent = this;
        return this;
    }

    public BinaryNode<T> getLeft() {
        return left;
    }

    public BinaryNode<T> setRight(BinaryNode<T> right) {
        this.right = right;
        right.parent = this;
        return this;
    }

    public BinaryNode<T> getRight() {
        return right;
    }

    @Override
    public String toString() {
        return value.toString();
    }

}
