package cn.fmnx.dataalgorithm.exception;

/**
 * @ClassName MyArrayIndexOutOfBoundsException
 * @Description: TODO
 * @Author gmf
 * @Date 2020/3/25
 * @Version V1.0
 **/
public class MyArrayIndexOutOfBoundsException extends RuntimeException{
    public MyArrayIndexOutOfBoundsException() {
        super();
    }
    public MyArrayIndexOutOfBoundsException(String msg){
        super(msg);
    }
}
