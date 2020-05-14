/**
 * this:
 *      1、this是一个关键字，全部小写
 *      2、this是什么，在内存方面是怎样的？
 *          一个对象一个this
 *          this是一个变量，是一个引用，this保存当前对象的内存地址
 *          指向自身。
 *          所以，严格意义上来说，this代表的就是“当前对象”
 *          this存储在堆内存当中对象的内部。
 */

 public class ThisTest01{
     public static void main(String[] args){

     }
 }

 class Customer{
    //属性
    //实例变量
    String name;

    //构造方法
    public Customer(){

    }

    public Customer(String s){
        name = s;
    }

    //顾客购物的方法
    //实例方法
    public void shopping(){

    }


 }