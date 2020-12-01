package BinaryTree;

public class BinaryTree<T extends Comparable<T>> implements BinaryTreeInterface<T> {

    Node<T> root;


    BinaryTree(){
        this(null,null,null);

    }

    BinaryTree(T value){
        this(value,null,null);

    }

    BinaryTree(T value, Node<T> leftChild, Node<T> rightChild){
        this.root = new Node(value,leftChild,rightChild);
    }





}
