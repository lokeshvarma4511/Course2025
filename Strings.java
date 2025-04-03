public class Strings {
    public static void main(String[] args) {
        String s1=new String();
        System.out.println(s1);

        String s2= new String("Lokesh");
        System.out.println(s2);
        System.out.println(s2+ " varma");

        // Backend itself object will be created, so no need to create a object as we usually do while creating a object
        String s3 = "Lokesh";
        System.out.println(s3);


        String s4="lokesh";
        System.out.println(s4=="lokesh");

        System.out.println("s5==name:");
        String s5=new String("Apple").intern(); // this method pulled the value to the string pool
        String name="Apple";
        System.out.println(s5==name);

    }
    
}


/*When we create a string with "new" specifying, the values will get store in Heap, it actually creates a new object everytime no 
matter what the values is, (s1==s2) results false, even if the values is same and if s1,s2 are created as a new objects
 * 
 * Normally created all strings are stored in string pool which is in "Heap", so to reduce redundant data, a newwly created data point to the existing data, is 
 its already there, else creates a new literal in string pool
 * 
 * 
 * String is immutable
 * you can perform (name +"varma"), but its not changing the value in "name" address, its creating the new 
 * value (Lokesh varma) in the string pool.
 * lokesh stored in heap when the string object is created and a new given name is created in new 
 * address in string pool when we appended a new string to the existing string.
 * 
 * We can also store a "new=String("apple")" in string pool with .intern();
 */