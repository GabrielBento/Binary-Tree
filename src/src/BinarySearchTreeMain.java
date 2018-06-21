package src;

public class BinarySearchTreeMain {

    public static void main(String[] args) {
        // instancia BST vazia
        BinarySearchTree<Integer> bsti = new BinarySearchTree<>();
        // a posição onde cada valor vai para depende dos outros valores
        bsti.add(10);
        bsti.add(5);
        bsti.add(20);
        bsti.add(15);
        bsti.add(18);
        
        // raiz
        System.out.println(bsti.getRoot());
        // subárvore esquerda da raiz
        System.out.println(bsti.getRoot().getLeft());
        // subárvore direita da raiz
        System.out.println(bsti.getRoot().getRight());
        // subárvore esquerda da subárvore direita da raiz
        System.out.println(bsti.getRoot().getRight().getLeft());
        
        // verifica se a árvore contém os valores
        System.out.println(bsti.contains(15));
        System.out.println(bsti.contains(10));
        System.out.println(bsti.contains(20));
        // não contém este valor
        System.out.println(bsti.contains(18));
        
        // ----
        
        BinarySearchTree<String> bsts = new BinarySearchTree<>();

        bsts.add("aba");
        bsts.add("aab");
        bsts.add("abc");
        
        System.out.println(bsts.getRoot());
        System.out.println(bsts.getRoot().getLeft());
        System.out.println(bsts.getRoot().getRight());
        
        System.out.println(bsts.contains("hello?"));
        
        System.out.println(new Integer(10).compareTo(new Integer(5)));
    }

}
