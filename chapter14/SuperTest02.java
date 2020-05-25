public class SuperTest02{
    public static void main(String[] args){
        new C();
        // 打印结果：
        /**
         * C的有参数构造执行（String）
         * C的无参数构造执行
         * C的有参数构造执行（String，int）
         * C的有参数构造执行（String）
         * B类的有参数构造执行（String）
         * C的有参数构造执行（String，int）
         */
    }
}
//父类A
class A{
    public A(){
        System.out.println("A的无参数构造执行");
    }
}

//子类B继承A
class B extends A{
    public B(){
        System.out.println("B的无参数构造执行");
    }

    public B(String name){
        System.out.println("B类的有参数构造执行（String）");
    }
}
//子类C继承B
class C extends B{
    public C(){
        this("zhangsan");
        System.out.println("C的无参数构造执行");

    }

    public C(String name){
        this(name, 20);
        System.out.println("C的有参数构造执行（String）");
    }

    public C(String name ,int age){
        super(name);
        System.out.println("C的有参数构造执行（String，int）");
    }
}