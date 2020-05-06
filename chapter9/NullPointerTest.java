public class NullPointerTest{
    public static void main(String[] args){
        //创建客户对象
        Customer c = new Customer();
        //引用
        System.out.println("用户的初始化ID为：" + c.id);

        //重新赋值uid
        c.id = 9521;
        System.out.println("用户重新赋值之后的id为：" + c.id);

        c = null;
        System.out.println("用户重新赋值之后的id为：" + c.id);
        
    }
}

class Customer{
    //客户id
    int id ;//成员变量中的实例变量，应该先创建对象，然后通过“引用”的方式来访问。
}   