package com.keyin.BinaryTree;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;


@Entity
public class StoredTree {
    
    @Id
    @SequenceGenerator(name = "tree_id", sequenceName = "tree_id", allocationSize = 1)
    @GeneratedValue(generator = "tree_id")
    private long id;
    @Column(name = "binary_structure", columnDefinition = "TEXT")
    private String binaryStructure;
    @Column(name = "input_num")
    private String inputNum;

    public StoredTree() {
    }

    public StoredTree(String binaryStructure, String inputNum) {
        this.binaryStructure = binaryStructure;
        this.inputNum = inputNum;
    }

    public long getId() {
        return id;
    }

    public String getInputNum() {
        return inputNum;
    }

    public void setInputNum(String inputNum) {
        this.inputNum = inputNum;
    }

    public String getBinaryStructure() {
        return binaryStructure;
    }

    public void setBinaryStructure(String binaryStructure) {
        this.binaryStructure = binaryStructure;
    }


}
