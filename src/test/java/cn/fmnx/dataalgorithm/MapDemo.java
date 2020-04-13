package cn.fmnx.dataalgorithm;

import org.junit.Test;

import java.util.*;

/**
 * @ClassName MapDemo
 * @Description: TODO
 * @Author gmf
 * @Date 2020/4/8
 * @Version V1.0
 **/
public class MapDemo {
    @Test
    public void demo(){
        Map map = new HashMap(4);
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("four",4);
//        Set set = map.keySet();
//        for (Object o : set) {
//            System.out.println(o+" = "+map.get(o));
//        }
        Set<Map.Entry<String,Integer>> set1 = map.entrySet();
        for (Map.Entry<String, Integer> entry : set1) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
    @Test
    public void t(){
        //tenTotwo(10); 1010 --> 0001
        System.out.println(10 >> 3);
        System.out.print(3 ^ (-2));
    }
    public void tenTotwo(int i){
        int tmp = i;
        Deque stack = new LinkedList();
        while (tmp > 0){
            int mod = tmp % 2;
            stack.push(mod);
            tmp  = tmp /2;
        }
        System.out.print(i+"------>");
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
    @Test
    public void queue(){
        int i = 8;
        int tmp = i;
        Deque queue = new LinkedList();
        while (tmp > 0){
            int mod = tmp % 2;
            queue.add(mod);
            tmp  = tmp /2;
        }
        System.out.print(i+"------>");
        while (!queue.isEmpty()){
            System.out.print(queue.poll());
        }
    }
}
