package cn.fmnx.dataalgorithm.linetable.linkedlist;

import cn.fmnx.dataalgorithm.exception.MyArrayIndexOutOfBoundsException;
import cn.fmnx.dataalgorithm.linetable.list.ListInter;

/**
 * @ClassName SingleLinkedList
 * @Description: TODO
 * @Author gmf
 * @Date 2020/3/26
 * @Version V1.0
 **/
public class SingleLinkedList implements ListInter {

    /**
     * 头结点，不存储数据，为了编程方便
     */
    private Node head = new Node();
    /**
     * 一共有几个节点
     */
    private int size;
    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int i) {
        Node p = head.next;
        for (int i1 = 0; i1 < i; i1++) {
            p = p.next;
        }
        return p.data;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean contains(Object e) {
        return false;
    }

    @Override
    public int indexOf(Object e) {
        return 0;
    }

    @Override
    public void add(int i, Object e) {
        //如果i位置错误报异常
        if(i <0  || i> size){
            throw new MyArrayIndexOutOfBoundsException("数组指针越界异常："+i);
        }
        //找到前一个节点，从head节点开始
        Node p = head;
        for (int j=0;j<i;j++){
            p = p.next;
        }
        //创建一个新的节点
        Node newNode = new Node(e);
        //指明新节点的后继节点
        newNode.next = p.next;
        //指明新节点的前驱结点
        p.next = newNode;
        size++;
    }

    @Override
    public void add(Object e) {
        this.add(size,e);
    }

    @Override
    public boolean addBefore(Object obj, Object e) {
        return false;
    }

    @Override
    public boolean addAfter(Object obj, Object e) {
        return false;
    }

    @Override
    public Object remove(int i) {
        return null;
    }

    @Override
    public boolean remove(Object e) {
        return false;
    }

    @Override
    public Object replace(int i, Object e) {
        return null;
    }

    @Override
    public String toString() {
        if (size == 0){
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        Node p = head.next;
        for (int i = 0; i < size; i++) {
            if(i != size-1){
                sb.append(p.data+", ");
            }else {
                sb.append(p.data);
            }
            //指针移到下一节点
            p = p.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
