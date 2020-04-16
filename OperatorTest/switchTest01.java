/*
    关于switch语句
        1、switch语句也属于选择结构，也是分支语句；

        2、switch语句的语法结构：
            一个比较完整的switch语句应该这样编写：
                switch(int或String类型的字面值或变量){
                    case int或String类型的字面值或变量;
                        java语句;
                        ...
                        break;
                    case int或String类型的字面值或变量;
                        java语句;
                        ...
                        break;
                    case int或String类型的字面值或变量;
                        java语句;
                        ...
                        break;
                    ...
                    default:
                        java语句;
                        ....
                }
        3、switch语句的执行原理：
                switch后面小括号当中的“数据”和case后面的“数据”进行一一匹配，匹配成功的分支执行里面的代码；
                按照自上而下的顺序依次匹配；
        4、匹配成功的分支执行，分支当中最后有“break”语句的话，整个switch语句终止。
        
        5、匹配成功的分支执行，分钟单中没有“break;”语句的话，直接进入下一个分支执行（不进行匹配）
           这种现象被称为case穿透现象。【提供break;语句可以避免穿透】
        
        6、所有分支都没有匹配成功，当有default的语句时，会执行default分支当中的分支。

        7、switch 后面和case 后面只能是int或者String类型的数据，不能是其他类型；
            *当然byte，short，char也可以直接写到switch和case后面，因为他们可以进行自动类型转换；
                byte，short，char可以自动转换成int类型；
            
            *JDK6的，switch和case后面只能探测int类型；

            *JDK7之后包括7版本在内，引入新特性，switch关键字和case关键字后面可以探测int

        8、case可以合并：
                int a = 1;
                switch(){//当值=1 走这个分支，当值=2 也走这个分支
                    case 1 : case 2 : 
                    break;
                }

*/