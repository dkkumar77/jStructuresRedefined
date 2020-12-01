package BinaryTree;

public class Node<T> {


    T value;
    Node<T> leftChild;
    Node<T> rightChild;


    Node(){
        this(null,null,null);
    }

    Node(T value){
        this(value,null,null);

    }

    Node(T value, Node<T> leftChild, Node<T> rightChild){
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    protected Node<T> getLeftChild(){

        return leftChild;
    }

    protected Node<T> getRightChild(){

        return rightChild;
    }

    protected T getValue(){
        return value;

    }

    protected void setLeftChild(Node<T> leftChild){
        this.leftChild = leftChild;

    }

    protected void setRightChild(Node<T> rightChild){
        this.rightChild = rightChild;
    }



}
