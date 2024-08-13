package com.keyin.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.keyin.BinaryTree.BinaryTree;
import com.keyin.BinaryTree.StoredTree;
import com.keyin.Repository.TreeRepository;

@Service
public class BinaryTreeService {

    @Autowired
    private BinaryTree binaryTree;

    @Autowired
    private TreeRepository treeRepository;

    public BinaryTree createBinaryTree(String[] input) {
        for (String number : input) {
            binaryTree.insert(number);
        }
        return binaryTree;
    }

    public void saveTree(String inputNumbers, String treeStructure) {
        StoredTree storedTree = new StoredTree(treeStructure, inputNumbers);
        treeRepository.save(storedTree);
    }
}
