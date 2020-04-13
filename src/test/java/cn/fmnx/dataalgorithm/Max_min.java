package cn.fmnx.dataalgorithm;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Max_min
 * @Description: TODO
 * @Author gmf
 * @Date 2020/4/1
 * @Version V1.0
 **/
public class Max_min {
    @Test
    public void demo(){
        int[] arr = {34,1,6,54,2,9,19};
        double[] arr_double = {78.1,1,34.5,15.5,82.6,4.7};
        System.out.println("int类型数组最大值:"+getMax(arr));
        System.out.println("int类型数组最小值:"+getMin(arr));
        System.out.println("double类型数组最大值:"+getMax(arr_double));
    }
    public double getMax(double[] obj){
        double max = obj[0];
        for (int i = 1; i < obj.length; i++) {
            if (max < obj[i]){
                max = obj[i];
            }
        }
        return max;
    }
    public int getMax(int[] obj){
        int max = obj[0];
        for (int i = 1; i < obj.length; i++) {
            if (max < obj[i]){
                max = obj[i];
            }
        }
        return max;
    }
    public int getMin(int[] obj){
        int min = obj[0];
        for (int i = 1; i < obj.length; i++) {
            if (min > obj[i]){
                min = obj[i];
            }
        }
        return min;
    }
    @Test
    public void de(){
        int[][] arr1 = new int[3][4];
        int[][] arr2 = new int[4][5];
        int[][] arr3 = new int[3][5];
        for (int i = 0; i <arr1.length ; i++) {
            for (int i1 = 0; i1 < arr1[0].length; i1++) {
                arr1[i][i1] = (int)(Math.random()*10+1);
            }
        }
        for (int i = 0; i <arr2.length; i++) {
            for (int i1 = 0; i1 < arr2[0].length; i1++) {
                arr2[i][i1] = (int)(Math.random()*10+1);
            }
        }
        //打印第一个矩阵
        System.out.println("打印第一个矩阵:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("[");
            for (int i1 = 0; i1 < arr1[0].length; i1++) {
                System.out.print(arr1[i][i1]+"\t");
            }
            System.out.println("]");
        }
        //打印第2个矩阵
        System.out.println("打印第一个矩阵:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("[");
            for (int i1 = 0; i1 < arr2[0].length; i1++) {
                System.out.print(arr2[i][i1]+"\t");
            }
            System.out.println("]");
        }
        arr3  = matrix(arr1,arr2);
        System.out.println("相乘得到的矩阵:");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print("[");
            for (int i1 = 0; i1 < arr3[0].length; i1++) {
                System.out.print(arr3[i][i1]+"\t");
            }
            System.out.println("]");
        }
    }
    public static int[][] matrix(int a[][], int b[][]) {
        //当a的列数与矩阵b的行数不相等时，不能进行点乘，返回null
        if (a[0].length != b.length)
            return null;
        //c矩阵的行数y，与列数x
        int y = a.length;
        int x = b[0].length;
        int c[][] = new int[y][x];
        for (int i = 0; i < y; i++)
            for (int j = 0; j < x; j++)
                //c矩阵的第i行第j列所对应的数值，等于a矩阵的第i行分别乘以b矩阵的第j列之和
                for (int k = 0; k < b.length; k++)
                    c[i][j] += a[i][k] * b[k][j];
        return c;
    }
    @Test
    public void paixu(){
        int arr[] = {1,2,3,5,3,2,1,7};
        Object arr1[] = {};
        List list = new ArrayList<Integer>();
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
         arr1 =  list.toArray();
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }


}
