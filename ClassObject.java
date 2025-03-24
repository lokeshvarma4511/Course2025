
class Claculator
{
    int apple;
    int add(int a1,int b1)
    {
        return a1+b1;
    }
}
public class ClassObject {
    public static void main(String[] args) {
        Claculator c1=new Claculator();

        System.out.println(c1.add(2,4));
    }
}
