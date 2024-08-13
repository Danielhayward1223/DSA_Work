package com.keyin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.keyin.BinaryTree.StoredTree;

@Repository
public interface TreeRepository extends JpaRepository<StoredTree, Long> {
}
