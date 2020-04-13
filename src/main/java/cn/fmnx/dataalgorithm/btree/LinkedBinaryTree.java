package cn.fmnx.dataalgorithm.btree;

/**
 * @ClassName LinkedBinaryTree
 * @Description: TODO
 * @Author gmf
 * @Date 2020/3/26
 * @Version V1.0
 **/
public class LinkedBinaryTree implements BinaryTree{
    /**
     * 根节点
     */
    private Node root;
    public LinkedBinaryTree() {
        super();
    }

    public LinkedBinaryTree(Node root) {
        super();
        this.root = root;
    }
    @Override
    public boolean isEmpty() {
        return root==null;
    }

    @Override
    public int size() {
        return this.size(root);
    }
    private int size(Node root){
        if (root==null){
            return 0;
        }else {
            //获取左子树的size
            int left = this.size(root.leftChild);
            //获取右子树的size
            int right = this.size(root.rightChild);
            //返回左子树和右子树的和加1(根节点)
            return left+right+1;
        }
    }
    @Override
    public int getHeight() {
        return this.getHeight(root);
    }
    private int getHeight(Node root){
        if (root==null){
            return 0;
        }else {
            //获取左子树的高度
            int left = this.getHeight(root.leftChild);
            //获取右子树的高度
            int right = this.getHeight(root.rightChild);
            //需要算上根节点所以加一
            return left > right ? left+1 : right+1;
        }
    }
    @Override
    public Node findKey(int value) {
        return null;
    }

    @Override
    public void preOrderTraverse() {
        System.out.println("先序遍历");
        this.preOrderTraverse(root);
        System.out.println();
    }
    public void preOrderTraverse(Node root){
        //先序遍历 根-》左-》右
        if (root != null){
            //遍历左子树
            this.preOrderTraverse(root.leftChild);
            //根
            System.out.print(root.value+" ");
            //遍历右子树
            this.preOrderTraverse(root.rightChild);
        }
    }
    @Override
    public void inOrderTraverse() {

    }

    @Override
    public void postOrderTraverse() {

    }

    @Override
    public void postOrderTraverse(Node node) {

    }

    @Override
    public void inOrderByStack() {

    }

    @Override
    public void preOrderByStack() {

    }

    @Override
    public void postOrderByStack() {

    }

    @Override
    public void levelOrderByStack() {

    }
}
