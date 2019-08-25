public class Playground{
    public static void main(String[] args){
        find a=new find();
        System.out.print(a.count_charge(100));
    }
}

class find{
    public int count_charge(int amount){
        return cc(amount,5);
    }
    public int cc(int amount, int kinds){
        return amount==0?1
                        :amount<0||kinds==0?0
                                           :this.cc(amount,kinds-1)+this.cc(amount-this.first(kinds),kinds);
    }
    public int first(int kinds){
        return  kinds==1?1:
                kinds==2?5:
                kinds==3?10:
                kinds==4?25:
                kinds==5?50:0;
    }
}