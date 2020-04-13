package cn.fmnx.dataalgorithm;

import cn.fmnx.dataalgorithm.btree.BinaryTree;
import cn.fmnx.dataalgorithm.btree.LinkedBinaryTree;
import cn.fmnx.dataalgorithm.btree.Node;
import org.junit.Test;

import java.util.TreeSet;

/**
 * @ClassName BtreeTest
 * @Description: TODO
 * @Author gmf
 * @Date 2020/3/26
 * @Version V1.0
 **/
public class BtreeTest {
    TreeSet treeSet;
    @Test
    public void demo(){
        //创建二叉树
        Node node8 = new Node(8,null,null);
        Node node9 = new Node(9,null,null);
        Node node5 = new Node(5,node8,null);
        Node node4 = new Node(4, null, node5);
        Node node3 = new Node(3, null, null);
        Node node7 = new Node(7, null, node9);
        Node node6 = new Node(6, null, node7);
        Node node2 = new Node(2, node3, node6);
        Node node1 = new Node(1,node4,node2);
        BinaryTree b = new LinkedBinaryTree(node1);
//        System.out.println("b.size() = " + b.size());
//        System.out.println("b.getHeight() = " + b.getHeight());
//        System.out.println("b = " + b);
        b.preOrderTraverse();
    }
}
