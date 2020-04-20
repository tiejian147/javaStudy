
/* 
    三元运算符/三目运算符/条件运算符

        1、语法规则：
            布尔表达式?表达式1 ： 表达式2；
        
        2、三元运算符的执行原理？
            当布尔表达式的结果是true的时候，将表达式1作为整个表达式的执行结果；
            当布尔表达式的结果是false的时候，将表达式2作为整个表达式的执行结果；
*/

public class OperatorTest06 {

    public static void main(String[] args) {

        // 编译错误，不是一个完整的java语句；
        // 10;

        // 编译错误，不是一个完整的java语句；
        // "男";

        // 布尔类型的变量；
        boolean sex = false;

        sex = true;
        System.out.println(sex ? "男" : "女");

        



        

    }

}