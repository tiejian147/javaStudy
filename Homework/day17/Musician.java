// 3）定义乐手类Musician，可以弹奏各种乐器play(Instrument i)
public class Musician{
    public static void main(String[] args){

    }
    //私有属性
    MusicalLnstruments erhu;

    //无参构造方法
    public Musician(){
        
    }

    //有参构造方法
    public Musician(MusicalLnstruments erhu){
        this.erhu = erhu;
    }
    //setter and getter
    public MusicalLnstruments getErhu(){
        return erhu;
    }

    public void setErhu(){
        this.erhu = erhu;
    }
    //定义演奏乐器的方法
    public void play(){
        
    }
}
