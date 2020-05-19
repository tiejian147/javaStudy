/**
 * 多态的基础语法：
 *      1、学习多态基础语法之前，我们需要普及两个概念：
 *          第一个：向上转型
 *              子----->父
 *          第二个：向下转型
 *              父----->子
 * 
 *          注意：java中允许向上转型，也允许向下转型
 * 
 *          *****（五颗星）无论是向上转型，还是向下转型，
 *          两种类型之间必须要有继承关系，没有继承关系编译器会报错。
 */

public class Test01 {
    public static void main(String[] args){
        Animal a1 = new Animal();
        a1.move();

        Cat c1 = new Cat();
        c1.move();

        Bird b1 = new Brid();
        b1.move();
    }
    
}
//动物类
class Animal{

    // String name;

    //编写移动的方法
    public void move(){
        System.out.println("动物在移动");
    }
}