public class ArithimeticOperators {
    public static void main(String[] args) {
        int num=2;
        int result=num++;
        System.out.println(result);
        result=num;
        System.out.println(result);
        System.out.println(num);

        int a = num & 1;
        System.out.println(a);

        int ab=5;
        int ac=2;
        ;
        result=ab++;
        System.out.println("ab "+(++ab));
        System.out.println("ab "+ab);
        System.out.println("ac "+ac);
        System.out.println(result);
    }
}
