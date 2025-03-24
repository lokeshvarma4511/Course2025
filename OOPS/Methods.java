package OOPS;


class Pen{
    public String getMePen(int money)
    {
        if (money>=10) {
            System.out.println("oka pennu 10rs");
        return "Pen";
        }
        else return money + "rs ki nee Maddakuuda raadhu";
    }
}
public class Methods {
    public static void main(String[] args) {
        
        Pen g1=new Pen();

        System.out.println(g1.getMePen(2));
    }
}