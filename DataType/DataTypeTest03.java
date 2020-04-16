/*
    关于浮点型数据类型：
    float 单精度【4个字节】
    double 双精度 【8个字节】

    double 的精度太低【相对来说的】，不适合做财务软件；
    财务涉及到钱的问题，要求精度较高，所以SUN在基础SE类库当中
    为程序员准备了精确度更高的类型，只不过这种类型是一种引用数据类型，不属于基本数据类型，它是：java.math.BigDecimal

    其实java程序中SUN提供了一套庞大的类库，java程序员是基于这套基础的类库来进行开发的。所以要知道java的SE类库的字节码在哪，
    要知道java的SE类库的远吗在哪？
        * SE类库字节码：
        * SE类库源码：

    例如：String.java 和 String.class 
    我们的(String[] args)中的String 使用的就是String.class 字节码文件；

    在java语言中，所有的浮点型字面值【3.0】，默认被当做double类型来处理，要想该字面值当做float类型来处理，需要在字面值后面添加F或者f；

    注意：double和float 在计算机内部二进制存储的时候存储的都是近似值。
        在现实世界当中有一些数字是无限循环的，例如：3.33333333333......
        计算机的资源是有限的，用有限的资源存储无限的数据只能存储近似值。

     
*/

public class DataTypeTest03{
    public static void main(String[] args){

        //定义一个双精度的浮点型数据类型的变量，并赋值
        //3.1是double类型的字面值；a是double类型的变量，不存在数据类型转换；
        double a = 3.1;//编译通过

        //打印变量a；
        System.out.println(a);//打印成功

        //定义一个单精度的浮点型数据类型的变量，并赋值；
        //4.3是double类型的字面值，f是float类型的变量；大容量转换成小容量需要加强制类型转换，否则会编译报错；
        //float b = 4.3;

        //解决方案：第一种：强制类型转换
        float b = (float)4.3;


        //打印变量b
        System.out.println(b);

        //解决方案：第二种：没有类型转换：
        float c = 4.4f;

        //打印变量c
        System.out.println(c);

        
    }
}