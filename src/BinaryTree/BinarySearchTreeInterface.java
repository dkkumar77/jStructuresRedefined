package BinaryTree;

public interface BinarySearchTreeInterface<T> {

    /**
     * Using the compareTo interface, it compares a specific Node's data with the passed data, and
     * traverses down the list to find the location as to where in the Binary Search, said value is
     * inserted.
     * @param value - value represents the  value for insertion.
     * @return - returnst hte value that is inserted.
     */
    T insert(Object value);

    /**
     * The remove method, will remove a specific node from the tree.
     * @param value - value is the node that will be removed from the tree.
     * @return - returns the value that is removed.
     */
    T remove(T value);

    /**
     * Ordinary boolean method that checks if the binary tree is empty.
     * @return - returns true or false if tree is empty.
     */
    boolean isEmpty();

    /**
     * find() takes in a T type parameter that is the value that is inserted. It will return null if value is not found.
     * @param value - the value that is being serached for.
     * @return - returns value if it is found.
     */
    T find(T value);

    /**
     * lookup returns true/false if value is in the binary search tree.
     * @param value - represents the value being looked for.
     * @return - returns true if value is in the tree.
     */
    boolean lookup(T value);

    /**
     * returns the node farthest to the left.
     * @return - returns a value of type Node<T>
     */
    Node<T> getLeftMost();

    /**
     * returns the node farthest to the right.
     * @return - returns a value of type Node<T>
     */
    Node<T> getRightMost();





}
