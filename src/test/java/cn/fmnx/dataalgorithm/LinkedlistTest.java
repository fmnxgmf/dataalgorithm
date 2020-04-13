package cn.fmnx.dataalgorithm;

import cn.fmnx.dataalgorithm.linetable.linkedlist.SingleLinkedList;
import cn.fmnx.dataalgorithm.linetable.list.ListImpl;
import cn.fmnx.dataalgorithm.linetable.list.ListInter;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @ClassName LinkedlistTest
 * @Description: TODO
 * @Author gmf
 * @Date 2020/3/26
 * @Version V1.0
 **/
public class LinkedlistTest {
    LinkedList list;
    ArrayList a;
    @Test
    public void demo(){
        ListInter list = new SingleLinkedList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        System.out.println("list = " + list);
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(3) = " + list.get(3));
        list.add(6,"g");
        System.out.println("list = " + list);
        System.out.println("list.size() = " + list.size());
    }
}
