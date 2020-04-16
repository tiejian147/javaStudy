/*
    boolean数据类型（布尔型数据类型）；

    在java语言当中boolean类型只有两个值：true，false，没有其他值；
    不想c语言当中，0和1可以表示假和真；

    在底层存储的时候boolean类型占用一个字节， 因为实际存储的时候false底层是0；true底层是1；

    布尔类型在实际开发当中非常常用，经常使用在逻辑运算和条件控制语句当中；
*/

public class DataTypeTest04
{
    public static void main (String[] args)
    {
        //编译错误：不兼容的类型；
        boolean flag =1;

        //声明一个布尔型的数据类型变量
        //变量LoginSuccess =true 的时候，走恭喜的print；否则就是=false，走不好意思的print；
        boolean LoginSuccess = true;

        //if语句以后再讲，【条件控制语句】
        if(LoginSuccess){
            System.out.println("恭喜你，登录成功！");
        }
        else{
            System.out.println("不好意思，账户或者密码输入不正确");
        }
    }
}