package cn.fmnx.dataalgorithm.btree;

/**
 * @ClassName Node
 * @Description: TODO
 * @Author gmf
 * @Date 2020/3/26
 * @Version V1.0
 **/
public class Node {
    Object value; //结点值
    Node leftChild;//左子树的引用
    Node rightChild;//右子树的引用


    public Node(Object value) {
        super();
        this.value = value;
    }

    public Node(Object value, Node leftChild, Node rightChild) {
        super();
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "Node [value=" + value + ", leftChild=" + leftChild
                + ", rightChild=" + rightChild + "]";
    }
}
