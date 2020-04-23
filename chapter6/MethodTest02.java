/*
    这个程序就是个体验程序，现在看不懂没有关系，纯体验
    体验一下方法的好处。

    注意：
        程序开始执行的方法是main方法。
        因为main方法是一个入口。

        在java语言中，所有方法体重的代码都是自上而下的顺序依次执行。
        这个必须记住。

        main方法不需要程序员调用，是由JVM调用的。
        但是除了main方法之外其他的方法，都需要程序员手动调用。
        方法只有调用的时候才会执行，方法不调用是不会执行的。

*/

public class MethodTest02 {
    public static void main(String[] args) {//自上而下依次执行

        // 方法定义在类体中。
        // 方法定义的先后顺序没有关系，都可以。
        //需求1：请编写程序，求100加200 的和；
        sumInt(100,200);
        //需求1：请编写程序，求666加888 的和；
        sumInt(666,888);

    }
    //专门在这个类体当中定义一个方法，这个方法专门来完成求和
    //x y z 在以下的sumInt方法中都属于局部变量，除了大括号就不认识了
    //局部变量有一个特点，方法结束之后，局部变量占用的内存会自动释放。
    public static void sumInt(int x, int y) {//自上而下的依次执行代码
        int z;
        z = x + y;
        System.out.println(x + "+" + y + "=" + z);
        // sumInt(666,999);
    }

}
// 这里并没有讲解方法的定义，以及方法的调用。