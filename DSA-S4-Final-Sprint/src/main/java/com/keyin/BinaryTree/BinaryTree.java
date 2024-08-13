package com.keyin.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.BinaryNode;


@Component
public class BinaryTree {
    public Node root;

    public BinaryTree() {
    }

    public Node getRoot() {
        return root;
    }

    public void insert(String value) {
        root = addRec(root, value);
    }

    private Node addRec(Node root, String value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (Integer.parseInt(value) < Integer.parseInt(root.getValue())) {
            root.setLeftNode(addRec(root.getLeftNode(), value));
        } else if (Integer.parseInt(value) > Integer.parseInt(root.getValue())) {
            root.setRightNode(addRec(root.getRightNode(), value));
        }

        return root;
    }

    public String toJson() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(this);
        } catch (Exception e) {
            return "";
        }
    }
}
