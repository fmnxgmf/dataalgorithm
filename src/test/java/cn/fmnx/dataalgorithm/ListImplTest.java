package cn.fmnx.dataalgorithm;

import cn.fmnx.dataalgorithm.linetable.list.ListImpl;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ListImplTest
 * @Description: TODO
 * @Author gmf
 * @Date 2020/3/26
 * @Version V1.0
 **/
public class ListImplTest {

    @Test
    public void demo(){
        ListImpl list = new ListImpl();
        list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);list.add(6);list.add(7);list.add(2,8);
        System.out.println("list = " + list);
        System.out.println("size="+list.size());
//        System.out.println(list.remove(0));
        System.out.println(list.remove((Object) 1));
        System.out.println("list = " + list);
        System.out.println("size="+list.size());
//        System.out.println(list.get(7));
//        System.out.println(list.contains(9));
//        System.out.println(list.indexOf(8));

    }
    @Test
    public void demo2(){
        List lists = new ArrayList();
        lists.add(1);lists.add(2);lists.add(3);lists.add(4);lists.add(5);lists.add(6);lists.add(7);lists.add(2,8);
        System.out.println("list = " + lists);
        System.out.println("size="+lists.size());
        System.out.println(lists.get(0));
        System.out.println(lists.indexOf(9));
    }
}
