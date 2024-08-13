package com.keyin.BinaryTree;

public class Node {
    public String value;
    public Node leftNode;
    public Node rightNode;
    public int height;

    public Node(String value) {
        this.value = value;
        this.leftNode = null;
        this.rightNode = null;
        this.height = 1;
    }

    public String getValue() {
        return value;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public int getHeight() {
        return height;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
