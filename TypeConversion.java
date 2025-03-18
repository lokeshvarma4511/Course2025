public class TypeConversion {

    public static void main(String[] args) {
        
// Implicity(auto conversion) is referred as Conversion, whereas Explicit conversion referred as Type casting

        // type casting from higher to lower, if the value is also higher, it works as higher%lower and gives the remainder
        byte a=127;
        int i = 270;
        byte b=(byte)i;
        System.out.println(b);

        long ll =Integer.MAX_VALUE;
        long ab=2147483647;
        int l=(int)ab;
        System.out.println(ll);


        char ae='a';
        char af=(char)(ae+1);
        System.out.println("char vlaue "+'a'+1);

        // TYPE PROMOTION
        byte aa=1;
        byte ac=1;
        // // This wont work
        // byte ad=aa*ac;
        // This will work  
        int ad=aa*ac;
        byte ag=(byte)(aa*ac);
        System.out.println(ad);


        byte b1=5,b2=6;

byte b3=(byte)(b1+b2);

System.out.println(b3);
    }
}