package com.keyin.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.keyin.BinaryTree.BinaryTree;
import com.keyin.BinaryTree.StoredTree;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import com.keyin.Service.BinaryTreeService;
import org.springframework.ui.Model;
import com.keyin.Repository.TreeRepository;

import java.util.List;


@Controller
public class BinaryController {

    @Autowired
    private TreeRepository treeRepository;

    @Autowired
    private BinaryTreeService binaryTreeService;

    @PostMapping("/process-numbers")
    public String processNumbers(@RequestParam String numbers, Model model) {

        String[] input = numbers.split(",");
        BinaryTree binaryTree = binaryTreeService.createBinaryTree(input);

        String treeStructure = binaryTree.toJson();
        binaryTreeService.saveTree(numbers, treeStructure);
        model.addAttribute("inputNumbers", numbers);
        model.addAttribute("treeStructure", treeStructure);
        return "result";
    }
    
    @GetMapping("/enter-numbers")
    public String enterNumbers() {
        return "enter-numbers";
    }

    @GetMapping("/previous-trees")
    public String showPreviousTrees(Model model) {
    List<StoredTree> trees = treeRepository.findAll();
    model.addAttribute("trees", trees);
    return "previous-trees";
}
    
}
