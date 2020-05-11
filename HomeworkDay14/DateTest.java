

public class DateTest {
    public static void main(String[] args){
        //创建日期对象
        Date d1 = new Date();

        //给年月日重新赋值
        d1.year = 2010;
        d1.month = 12;
        d1.day = 23;

        //打印年月日
        System.out.println("日期为：" + d1.year + "年" + d1.month + "月" + d1.day + "日");
        System.out.println("------------------------------------------------------");

        //创建男人对象
        Men p1 = new Men();

        //给男人的属性赋值
        p1.idNo = 11221;
        p1.name = "zhangsan";
        p1.sex = "男";
        p1.woman = "知否";

        //输出男人的各类信息。
        System.out.println("他的身份证号码是：" + p1.idNo);
        System.out.println("他的名字是：" + p1.name);
        System.out.println("他的性别是：" + p1.sex);
        System.out.println("他的女人是：" + p1.woman);
        System.out.println("------------------------------------------------------");

        //创建女人对象
        Women p2 = new Women();

        //给女人的属性赋值
        p2.idNo = 12326521;
        p2.name = "安杰";
        p2.sex = "女";
        p2.man = "江德福";

        //输出男人的各类信息。
        System.out.println("她的身份证号码是：" + p2.idNo);
        System.out.println("她的名字是：" + p2.name);
        System.out.println("她的性别是：" + p2.sex);
        System.out.println("她的男人是：" + p2.man);
        System.out.println("------------------------------------------------------");

        //创建银行对象
        BankAccount bank1 = new BankAccount();

        //给银行对象赋值
        bank1.bankNum = 12312123;
        bank1.bankPassword = 321;
        bank1.accountBalance = 500.12F;

        //输出银行的账户信息
        System.out.println("银行账户为：" + bank1.bankNum);
        System.out.println("银行密码为：" + bank1.bankPassword);
        System.out.println("银行余额为：" + bank1.accountBalance);
        System.out.println("------------------------------------------------------");

        //创建丈夫对象
        Husband nan1 = new Husband();
        //创建妻子对象
        Wife nv1 = new Wife();

        nan1.idNo = 1232;
        nan1.name = "大刘";

        nv1.idNo = 122222;
        nv1.name = "小方";

        Husband.Wife = nan1;
        // Wife.Husband = nv1;

        System.out.println("丈夫的身份证号：" + nan1.idNo);
        System.out.println("丈夫的姓名：" + nan1.name);
        // System.out.println("丈夫的妻子：" + Husband.Wife.name);

       

        // System.out.println();
    }
}