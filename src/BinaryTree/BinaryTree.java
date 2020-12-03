package BinaryTree;

public class BinaryTree<T> implements BinaryTreeInterface<T> {

    /**
     * root is of type Node which is the container of the highest value in the Tree.
     */
    Node<T> root;


    /**
     * Generic constructor that passes all null values a super constructor.
     */
    BinaryTree(){
        this(null,null,null);

    }

    /**
     * Generic constructor that passes a value of type T, and null Node values to a super constructor.
     * @param value
     */
    BinaryTree(T value){
        this(value,null,null);

    }

    /**
     * Constructor that initializes the root value.
     * @param value - value holds data of type T.
     * @param leftChild - leftChild is of type Node.
     * @param rightChild - rightChild is of type Nde.
     */
    BinaryTree(T value, Node<T> leftChild, Node<T> rightChild){
        this.root = new Node(value,leftChild,rightChild);
    }

    /**
     * isEmpty() returns true if the BinaryTree is empty.
     * @return - returns true if empty.
     */
    protected boolean isEmpty(){

        return this.root == null;
    }

    /**
     * Returns the root Node.
     * @return ^^^^^^^^^^^^^.
     */
    protected Node<T> getRootNode(){
        return root;
    }

    /**
     * Returns the root's data.
     * @return ^^^^^^^^^^^^^^^.
     */
    protected T getRootData(){
        return root.getValue();
    }



}



