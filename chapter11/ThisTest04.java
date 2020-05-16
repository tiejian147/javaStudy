public class ThisTest04{
    public static void main(String[] args){
        Date d1 = new Date();
        System.out.println("日期为" + d1.year + "年" + d1.month + "月" + d1.day + "日");
    }
}

/**
 * 需求：
 * 1、定义一个日期类，可以表示年月日信息
 * 2、需求中要求：
 *      如果调用无参数构造方法，默认创建的日期为：1970年1月1日；
 *      当然，除了调用无参数构造方法之外，也可以调用有参数的构造方法
 *      来创建日期对象。
 */

 class Date{
     //创建实例变量年
     int year;
     //创建实例变量月
     int month;
     //创建实例变量日
     int day;

     //创建无参数构造方法
     public Date(){
        this.year = 1970;
        this.month = 1;
        this.day = 1;

     }
     //创建有参数构造方法
     public Date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
     }
     //setter 和 getter 方法
     public void setYear(int year){
         this.year = year;
     }
     public void setMonth(int month){
        this.month = month;
    }
    public void setDay(int day){
        this.day = day;
    }

    public int getYear(){
        return year;
    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }

 }