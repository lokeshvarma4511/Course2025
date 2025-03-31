
class Student
{
    int rollno;
    String name;
    String Blood;
    Character Section;
}
public class ArrayOfObjects
{
    public static void main(String[] args)
    {
        Student students[] = new Student[3];
        Student s1 = new Student();
        s1.name="shekar kodangal";
        s1.rollno=1;
        s1.Blood="O-";
        s1.Section='C';

        Student s2 = new Student();
        s1.name="Raju, open tap";
        s1.rollno=2;
        s1.Blood="O-";
        s1.Section='C';

        Student s3 = new Student();
        s1.name="Chintu model, Kothapet";
        s1.rollno=3;
        s1.Blood="O-";
        s1.Section='C';

        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
        System.out.println(s1);
    }
}