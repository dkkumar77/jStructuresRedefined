package BinaryTree;

public class Node<T> {


    T value;
    Node<T> leftChild;
    Node<T> rightChild;

    /**
     * Generic constructor that takes no parameters, sets all default attributes to null.
     */
    Node(){
        this(null,null,null);
    }

    /**
     * Class constructor that takes in parameter value and sets subtree root to passed value.
     * leftChild & rightChild are set to null.
     * @param value - value of type T holds data of anytype.
     */
    Node(T value){
        this(value,null,null);

    }

    /**
     * Class constructor that initializes class attributes.
     * @param value - value holds data of anytype.
     * @param leftChild - leftChild represents the subtree root's left child.
     * @param rightChild - rightChild represents the subtree root's right child.
     */
    Node(T value, Node<T> leftChild, Node<T> rightChild){
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    /**
     * getLeftChild returns the left Node value of the current Node.
     * @return - returns the current instances leftChild.
     */
    protected Node<T> getLeftChild(){

        return leftChild;
    }

    /**
     * getRightChild returns the right Node value of the current Node.
     * @return - return the current instances rightChild.
     */
    protected Node<T> getRightChild(){

        return rightChild;
    }

    /**
     * getValue returns the value that is held in this Node.
     * @return - returns a value of type T.
     */
    protected T getValue(){
        return value;

    }

    /**
     * setLeftChild sets the subtree root's left child to the parameter-passed Node.
     * @param leftChild - leftChild is of type Node.
     */
    protected void setLeftChild(Node<T> leftChild){
        this.leftChild = leftChild;

    }

    /**
     * setRightChild sets the subtree root's right child to the parameter-passed Node.
     * @param rightChild - rightChild is of type Node.
     */
    protected void setRightChild(Node<T> rightChild){
        this.rightChild = rightChild;
    }


    protected Node<T> setValue(T data){
        this.value = data;
        return this;

    }

}
