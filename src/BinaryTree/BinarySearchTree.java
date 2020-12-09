package BinaryTree;



public class BinarySearchTree<T extends Comparable<T>> extends BinaryTree implements BinarySearchTreeInterface {

    /**
     * {@inheritdoc}
     */
    BinarySearchTree(){
        super();
    }
    /**
     * {@inheritdoc}
     */
    BinarySearchTree(T value){
        super(value);
    }
    /**
     * {@inheritdoc}
     */
    @SuppressWarnings("unchecked")
    @Override
    public T insert(Object value) {
        if(isEmpty()){
            root = new Node(value);
            return (T) value;
        }
        else if (!lookup(value)){
            insertAlgo((T) value, root);
            return (T) value;
        }
        return null;

    }



    public Node<T> insertAlgo(T value, Node<T> successor){

        if(successor == null){
            return successor.setValue(value);
        }

        else if(value.compareTo((T) successor) < 0){
            insertAlgo(value, successor.getRightChild());
        }
        else if(value.compareTo((T) successor) > 0){
            insertAlgo(value, successor.getRightChild());
        }
        return null;
    }
    /**
     * {@inheritdoc}
     */
    @Override
    public T remove(Object value) {
        return null;
    }
    /**
     * {@inheritdoc}
     */
    @Override
    public boolean isEmpty() {
        return this.root == null;
    }

    /**
     * {@inheritdoc}
     */
    @Override
    public T find(Object value) {
        return null;
    }

    /**
     * {@inheritdoc}
     */
    @Override
    public boolean lookup(Object value) {
        return false;
    }
    /**
     * {@inheritdoc}
     */
    @Override
    public Node<T> getLeftMost() {
        return null;
    }
    /**
     * {@inheritdoc}
     */
    @Override
    public Node<T> getRightMost() {
        return null;
    }
}
