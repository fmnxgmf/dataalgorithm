package cn.fmnx.dataalgorithm;

import org.junit.Test;

import java.time.LocalDate;

/**
 * @ClassName Paixu
 * @Description: TODO
 * @Author gmf
 * @Date 2020/4/8
 * @Version V1.0
 **/
public class Paixu {
    @Test
    public void BubbleSort(){
        int arr[] = {42,20,17,13,28,14,23,15};
        for (int i = 0; i < arr.length-1; i++) {
           int isum = 0;
            for (int j = 0; j <arr.length-1-i ; j++) {
                if (arr[j] < arr[j+1]){
                    arr[j] = arr[j] ^ arr[j+1];
                    arr[j+1] = arr[j] ^ arr[j+1];
                    arr[j] = arr[j] ^ arr[j+1];
                }
                isum++;
            }
            System.out.println("isum = " + isum);
            System.out.print("[");
            for (int i1 = 0; i1 < arr.length; i1++) {
                System.out.print(arr[i1]+"\t");
            }
            System.out.println("]");
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
    @Test
    public void selectSort(){
        int arr[] = {42,20,17,13,28,14,23,15};
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1;j < arr.length;j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            if (min != i){
                arr[i] = arr[i]+arr[min];
                arr[min] = arr[i] - arr[min];
                arr[i] = arr[i] - arr[min];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
    @Test
    public void inserSort(){
        int arr[] = {42,20,17,13,28,14,23,15};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1;j > 0;j--){
                if (arr[j] < arr[j-1]){
                    arr[j] = arr[j] + arr[j-1];
                    arr[j-1] = arr[j] - arr[j-1];
                    arr[j] = arr[j] - arr[j-1];
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
    @Test
    public void shellSort(){
        int[] arr = {59,20,17,13,28,14,23,83};
        int incre = arr.length;
        while (true){
            incre = incre / 2; //增量4-2-1
            System.out.println("incre = " + incre);
            for (int i = 0; i < incre; i++) {
                for (int j = i+incre; j < arr.length; j+=incre) {
                    for (int k = j; k > i ; k-=incre) {
                        if (arr[k] < arr[k-incre]){
                            arr[k-incre] = arr[k] + arr[k-incre];
                            arr[k] = arr[k-incre] - arr[k];
                            arr[k-incre] = arr[k-incre] - arr[k];
                        }else {
                            break;
                        }
                    }
                }
            }
            if (incre == 1){
                break;
            }
            System.out.println("增量为:"+incre);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+"\t");
            }
            System.out.println();
        }
//        //增量为1在直接插入排序
//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = i+1; j > 0 ; j--) {
//                if (arr[j] < arr[j-1]){
//                    arr[j] = arr[j] + arr[j-1];
//                    arr[j-1] = arr[j] - arr[j-1];
//                    arr[j] = arr[j] - arr[j-1];
//                }
//            }
//        }
        System.out.println("增量为:"+1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }

    }
    @Test
    public void ss(){
        for (int i = 0; i >2 ; i++) {
            System.out.println("i = " + i);
        }
    }
    @Test
    public void time(){
        LocalDate date = LocalDate.now();
        System.out.println("date = " + date);
        LocalDate afterDate = date.plusDays(1);
        System.out.println("afterDate = " + afterDate);
        //date = date.minusDays(date.getDayOfMonth()-2);
        System.out.println(date.minusDays(date.getDayOfMonth()-1));
    }

}
