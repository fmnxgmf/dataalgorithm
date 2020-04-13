package cn.fmnx.dataalgorithm.linetable.linkedlist;

import lombok.Data;

/**
 * @ClassName Node
 * @Description: TODO
 * @Author gmf
 * @Date 2020/3/26
 * @Version V1.0
 **/
@Data
public class Node {
    /**
     * 要存储的数据
     */
    Object data;
    Node next;
    public Node(){}
    public Node(Object data){
        super();
        this.data = data;
    }
    public Node(Object data, Node next) {
        super();
        this.data = data;
        this.next = next;
    }
}
