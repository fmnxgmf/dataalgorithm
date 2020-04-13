package cn.fmnx.dataalgorithm.linetable.list;

import cn.fmnx.dataalgorithm.exception.MyArrayIndexOutOfBoundsException;

import java.util.Arrays;

/**
 * @ClassName ListImpl
 * @Description: 顺序表底层采用的数组，但是长度可以动态变化
 * @Author gmf
 * @Date 2020/3/25
 * @Version V1.0
 **/
public class ListImpl implements ListInter{
    private Object[] elementData; //底层是一个数组，目前还没有确定长度

    private int size; //不是数组分配了几个空间，而是元素的个数

    public ListImpl(){
        //没有指定长度，默认长度是4
        this(4);
    }
    /**
     *
     * @param initialCapacity 指定数组的初始长度
     */
    public ListImpl(int initialCapacity){
        //给数组分配指定数量的空间
        elementData = new Object[initialCapacity];
        //默认size等于0
    }
    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int i) {
        if (i>size-1){
            throw new MyArrayIndexOutOfBoundsException("数组越界异常");
        }
        return elementData[i];
    }

    @Override
    public boolean isEmpty() { return size==0; }

    @Override
    public boolean contains(Object e) {
        for (int i =0;i<elementData.length;i++){
            if (elementData[i]==e){
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(Object e) {
        for (int i = 0; i < size; i++) {
            if (elementData[i]==e){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void add(int i, Object e) {
        // 判断i的位置
        if(i<0 || i>size){
            throw new MyArrayIndexOutOfBoundsException("数组索引越界异常:"+i);
        }
        //数组满了需要扩容
        if(size==elementData.length){
            grow();
        }
        //后移i及其后面的元素
        for (int j = size;j>i;j--){
            elementData[j] = elementData[j-1];
        }
        elementData[i] = e;
        size++;
    }

    @Override
    public void add(Object e) {
        this.add(this.size,e);
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
        Object obj;
        if (i>size-1){
            throw new MyArrayIndexOutOfBoundsException("数组越界异常");
        }
        obj = elementData[i];
        for (int j = i; j < size-1; j++) {
            elementData[j] = elementData[j+1];
        }
        size--;
        return obj;
    }

    @Override
    public boolean remove(Object e) {
        for (int i = 0; i < size; i++) {
            if (elementData[i]==e){
                return this.remove(i)==e;
            }
        }
        return false;
    }

    @Override
    public Object replace(int i, Object e) {
        return null;
    }

    private void grow(){
        //新创建一个新的数组，长度是旧数组2倍
//		Object [] newArr = new Object[elementData.length*2];
//		//将旧数组的数据拷贝到新数组
//		for(int i=0;i<size;i++){
//			newArr[i] = elementData[i];
//		}
//		让elementData指向新数组
//		elementData = newArr;
        elementData = Arrays.copyOf(elementData,elementData.length*2);
    }

    @Override
    public String toString() {
        if (size==0){
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i=0;i<size;i++){
            if (i !=size-1){
                sb.append(elementData[i]+", ");
            }else {
                sb.append(elementData[i]);
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
