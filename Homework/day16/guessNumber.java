/**
 * 1、猜数字游戏
 *      一个类A有一个实例变量v，从键盘接受一个正整数作为实例变量v的初始值。
 *      另外再定义一个类B，对A类的实例变量进行猜测。
 *          如果大了，测提示大了。
 *          小了则提示小了。
 *          等于则提示猜测成功。
 * 
 * 2、请定义一个交通工具（vihicle）的类
 *      其中有属性：
 *          速度（speed）
 *          体积（size）等等
 *          方法：
 *              移动move()
 *              设置速度setSpeed(int speed)
 *              加速speedUp()
 *              减速speedDown()
 *      最后再测试类Vehicle中的main()中实例化一个交通工具对象。
 *      并通过方法给她初始化speed，size的值并且打印出来。
 *      另外调用加减速的方法对速度进行改变。
 * 
 * 3、在程序中经常对时间进行操作但是并没有时间类型的数据。
 *    那么我们可以自己实现一个时间类来满足程序中的需要。
 *    定义名为MyTime的类其中应有三个整型成员：时hour、分minute、秒second
 *    为了保证数据的安全性这三个成员变量应声明为私有。
 *    为MyTime类定义构造方法以方便创建对象时初始化成员变量。
 *    再定义diaplay方法用于将时间信息打印出来。
 *    为MyTime类添加以下方法：
 *      addSecond(int sec)
 *      addMinute(int min)
 *      addHour(int hour)
 *      subSecond(int sec)
 *      subMinute(int min)
 *      subHour(int hour)
 * 
 */

 public class guessNumber{
     public static void main(String[] args){

     }
 }

 class A{
     //定义一个实例变量
     int v;
     public void setNumber(){
         //然后创建键盘扫描对象
        java.util.Scanner s = new java.util.Scanner(System.in);

        System.out.print("请输入您要键入的数字：" );//输出提示信息，要不然用户都不知道要干嘛

        //通过键盘输入年龄值
        v = s.nextInt();// 停下来等待用户的输入，输入之后自动接收，赋值给age变量。
     }

 }

 class B extends A{
    public void compare(){
        // if(){
            
        // }
    }
 }