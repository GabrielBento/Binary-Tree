package src;

public class BinaryTree<T> {

    protected BinaryNode<T> root;

    public BinaryTree(T val) {
        this.root = new BinaryNode<>(val);
    }

    public BinaryTree() {
    }

    public BinaryNode<T> getRoot() {
        return root;
    }
    
    public boolean isEmpty() {
        return root == null;
    }

}
