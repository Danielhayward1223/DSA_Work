package com.keyin.Test;

import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.junit.jupiter.api.Test;

import com.keyin.Repository.TreeRepository;

@SpringBootTest
public class BinaryTreeServiceTest {

    @Autowired
    private BinaryTreeService binaryTreeService;

    @MockBean
    private TreeRepository treeRepository;

    @Test
    public void testCreateBinaryTree() {
        String[] input = {"3", "1", "4"};
        BinaryTree tree = binaryTreeService.createBinaryTree(input);
        assertNotNull(tree);
    }

    @Test
    public void testSaveTree() {
        String inputNumbers = "3,1,4";
        String treeStructure = "{\"value\":3,\"left\":{\"value\":1},\"right\":{\"value\":4}}";
        binaryTreeService.saveTree(inputNumbers, treeStructure);
        verify(treeRepository, times(1)).save(any(StoredTree.class));
    }

    @Test
    public void testShowPreviousTrees() {
        List<StoredTree> trees = Arrays.asList(new StoredTree("{}", "1,2,3"));
        when(treeRepository.findAll()).thenReturn(trees);
        List<StoredTree> result = treeRepository.findAll();
        assertEquals(1, result.size());
    }
}
