package cn.fmnx.dataalgorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Demo
 * @Description: TODO
 * @Author gmf
 * @Date 2020/4/8
 * @Version V1.0
 **/
public class Demo {

    public static void main(String[] args) {
        int arr[] = {1,2,3,5,3,2,1,7};
        Integer arr1[] = new Integer[arr.length];
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int i1 = 0; i1 < arr.length; i1++) {
                if (i != i1){
                    if (arr[i] == arr[i1]){
                        flag = true;
                    }
                }
            }
            if (!flag){
                list.add(arr[i]);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            arr1[i] = list.get(i);
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != null){
                System.out.println(arr1[i]);
            }

        }
    }
}
