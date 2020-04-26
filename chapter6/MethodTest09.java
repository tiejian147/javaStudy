public class MethodTest09{
    public static void main(String[] args){
        //调用方法可以写两行
        int result = sum(100, 200);
        System.out.println(result);

        //还可以写的更简洁一些：
        System.out.println(sum(1000, 2000));
    }

    public static boolean flag(){
        return true;
    }

    //编写一个求和的方法
    public static int sum(int x,int y){
        return x + y;
    }
}