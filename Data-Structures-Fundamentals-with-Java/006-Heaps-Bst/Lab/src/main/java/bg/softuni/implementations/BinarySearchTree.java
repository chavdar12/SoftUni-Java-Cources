package bg.softuni.implementations;

import bg.softuni.interfaces.AbstractBinarySearchTree;

public class BinarySearchTree<E extends Comparable<E>> implements AbstractBinarySearchTree<E> {

    private Node<E> root;
    private boolean isContains;

    public BinarySearchTree() {
    }

    public BinarySearchTree(Node<E> current) {
        this.copy(current);
    }

    private void copy(Node<E> node) {
        if (node != null) {
            this.insert(node.value);
            this.copy(node.leftChild);
            this.copy(node.rightChild);
        }
    }

    @Override
    public void insert(E element) {
        if (this.root == null) {
            this.root = new Node<>(element);
        } else {
            this.addElement(this.getRoot(), element);
        }
    }

    private void addElement(Node<E> node, E element) {
        if (node.value.compareTo(element) > 0) {
            if (node.leftChild == null) {
                node.leftChild = new Node<>(element);
            } else {
                addElement(node.leftChild, element);
            }
        } else {
            if (node.rightChild == null) {
                node.rightChild = new Node<>(element);
            } else {
                addElement(node.rightChild, element);
            }
        }
    }

    @Override
    public boolean contains(E element) {
        containsElement(this.root, element);

        return isContains;
    }

    private void containsElement(Node<E> root, E element) {
        if (root == null) {
            return;
        }

        if (root.value.compareTo(element) == 0) {
            this.isContains = true;
            return;
        }

        if (element.compareTo(root.value) < 0) {
            containsElement(root.leftChild, element);
        } else {
            containsElement(root.rightChild, element);
        }
    }

    @Override
    public AbstractBinarySearchTree<E> search(E element) {
        AbstractBinarySearchTree<E> binarySearchTree = new BinarySearchTree<>();

        Node<E> current = this.root;
        while (current != null) {
            if (element.compareTo(current.value) < 0) {
                current = current.leftChild;
            } else if (element.compareTo(current.value) > 0) {
                current = current.rightChild;
            } else {
                return new BinarySearchTree<>(current);
            }
        }

        return binarySearchTree;
    }


    @Override
    public Node<E> getRoot() {
        return this.root;
    }

    @Override
    public Node<E> getLeft() {
        return this.root.leftChild;
    }

    @Override
    public Node<E> getRight() {
        return this.root.rightChild;
    }

    @Override
    public E getValue() {
        return this.root.value;
    }
}
