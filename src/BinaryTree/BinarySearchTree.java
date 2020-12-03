package BinaryTree;

public class BinarySearchTree<T extends Comparable<T>> extends BinaryTree implements BinarySearchTreeInterface {

    BinarySearchTree(){
        super();
    }

    BinarySearchTree(T value){
        super(value);
    }

    /**
     * {@inheritdoc}
     */
    @Override
    public T insert(Object value) {
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
