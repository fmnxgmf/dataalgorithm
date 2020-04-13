package cn.fmnx.dataalgorithm;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.regex.Pattern;

/**
 * @ClassName DataDemo
 * @Description: TODO
 * @Author gmf
 * @Date 2020/3/22
 * @Version V1.0
 **/
@SpringBootTest
public class DataDemo {
    LinkedList ll;
    ArrayList lsit;
    @Test
    public void demo(){
        System.out.println(3 >> 1);
    }
    @Test
    public void res(){
        int num = 123456;
        StringBuilder s = new StringBuilder();
        while (num / 10 >0){
            int a = num % 10;
            s.append(a+1);
            num /= 10;
            if(num < 10){
                s.append(num+1);
            }
        }
        System.out.println(s.toString());
    }

    @Test
    public void sqrt(){
        //求完全平方数
        for (int i = 1; i <1000000 ; i++) {
            Integer sqrt1 = Integer.parseInt(String.valueOf(Math.sqrt(i + 10)).substring(0,String.valueOf(Math.sqrt(i + 10)).indexOf(".")));
            Integer sqrt2 = Integer.parseInt(String.valueOf(Math.sqrt(i + 50)).substring(0,String.valueOf(Math.sqrt(i + 50)).indexOf(".")));
            if ((sqrt1*sqrt1 == i+10)&&(sqrt2*sqrt2 == i+50)){
                System.out.println("i = " + i);
            }
        }
    }
    @Test
    public void date() {
        //2020年2月8号据1989年多少天
        int year = 2020;
        int month = 3;
        int day = 25;
        int sum = 0;
        //平年365，闰年366
        for (int i = 1989; i < year; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                sum += 366;
            } else {
                sum += 365;
            }
        }
        //求当前年月份的天数
        for (int i = 1; i < month; i++) {
            if (i == 2) {
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    sum += 29;
                } else {
                    sum += 28;
                }
            } else {
                if (i == 4 || i == 6 || i == 9 || i == 11) {
                    sum += 30;
                } else {
                    sum += 31;
                }
            }
        }
        //求本月的天数
        //距离今天但没有包括今天所有减一操作
        sum += day - 1;
        System.out.println("1989年1月1日距今天:" + sum + "天");
    }
    @Test
    public void date2() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d1 = sdf.parse("1989-01-01");
        Date nowDate = sdf.parse(sdf.format(new Date()));
        Calendar c = Calendar.getInstance();
        c.setTime(d1);
        long c1 = c.getTimeInMillis();
        c.setTime(nowDate);
        long c2 = c.getTimeInMillis();
        long day = (c2-c1)/(24*3600*1000);
        System.out.println("day = " + day);
    }
    @Test
    public void by(){
//        Integer j;
//        int i =128;
//        byte b = (byte)i;
//        System.out.println("b = " + b);
        System.out.println(8/3);
        System.out.println(Integer.MAX_VALUE);
    }
    @Test
    public void prin(){
        for (int i = 0; i <8 ; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

