package biz.nilstest;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2017/1/5.
 */
public class TestFinal {


    //总结:
//final型变量.系统不会给它赋初值.
//final有static修饰的时候,只能在声明的时候直接给它赋值.别处没法对它进行赋值
//比如,在构造方法里给它赋值,会报错,错误分析:静态变量(不需任何对象)直接由类名调用.
//final没有static修饰的时候,有两种赋值:1.直接赋值.2在构造方法里给它赋值.每个构造方法必
//须给它赋值.

    private static  final  String ss ="11";

//    public TestFinal(String ss) {
//        this.ss = ss;
//    }


    public static void main(String[] args) {

        System.out.println(new TestFinal().ss);

    }
}
