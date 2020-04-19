
public class SwitchTest01 {
    public static void main(String[] args){

        //用户输入1，代表星期一
        //用户输入2，代表星期二
        //用户输入3，代表星期三
        //...
        //用户输入7，代表星期日



        // 然后创建键盘扫描对象
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("请输入数字：");

        int num = s.nextInt();//等待用户输入数字

        switch(num){
            case 1 :
                System.out.println("星期一");
                break;
            
            case 2 :
                System.out.println("星期二");
                break;
                
            case 3 :
                System.out.println("星期三");
                

            case 4 :
                System.out.println("星期四");
                break;
            
            case 5 :
                System.out.println("星期五");
                break;
                
            case 6 :
                System.out.println("星期六");
                break;

            case 7 :
                System.out.println("星期七");
                break;
            default :
                System.out.println("不好意思，数字输入错误");
            
        }


    }
}