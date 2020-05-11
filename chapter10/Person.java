/**
 * person表示人类：
 * 每一个人都有年龄这样的属性；
 * 年龄age，int类型
 * 这里先不做封装机制，分析程序存在什么缺点？
 *  Person类的age属性对外暴露，可以再外部程序中随意访问，导致了不安全。
 */

 /*
public class Person{
    //定义人类
    //实例变量，属性
    //age属性是暴露的，在外部程序中可以随意访问，
    //导致了不安全
    int age;
    
}
*/

//尝试封装一下：
//不再对外暴露复杂的数据，封装起来
//对外只提供简单的操作入口
//有点：第一数据安全了，第二调用者也方便了
public class Person{
    //private表示私有的，被这个关键字修饰之后，该数据只能在本类中访问。
    //出了这个类就不能访问了。
    private int age;
}