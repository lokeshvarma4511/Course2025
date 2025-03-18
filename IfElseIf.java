public class IfElseIf {
    public static void main(String[] args) 
    {
        if (1>0) 
            System.out.println("1");
            // System.out.println(2);
        else
        System.out.println("c");
        // System.out.println("d");

        // Greatest among 3
        int x=8,y=7,z=9;
        if (x>y && x>z) {
            System.out.println("Greater x");
        }
        else if (y>z) {
            System.out.println("Greater y");
        }
        else
        System.out.println("Greater z");

        // Ternary operator
        int xx=1;
        int res = xx>1?1:0;
        System.out.println("tern: "+res);


        //Switch

        // int day=2;

        switch(8)
        {
        case 0:System.out.println("Sunday");break;
        case 1: System.out.println("Monday");break;
        case 2:System.out.println("Tuesday");break;
        case 3:System.out.println("Wednesday");break;
        case 4:System.out.println("Thursday");break;
        case 5:System.out.println("Friday");break;
        case 6:System.out.println("Saturday");break;
        default :System.out.println("Entered wrong day number");
        }

        switch(33)
        {
            case 0->System.out.println("Sunday");
            case 1-> System.out.println("Monday");
            case 2->System.out.println("Tuesday");
            case 3->System.out.println("Wednesday");
            case 4->System.out.println("Thursday");
            case 5->System.out.println("Friday");
            case 6->System.out.println("Saturday");
            default ->System.out.println("Entered wrong day number");
        }
        
    }
}