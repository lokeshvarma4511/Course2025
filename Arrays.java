public class Arrays {
 public static void main(String[] args) {
    int a[][]= new int[3][4];

    int random=0;

    int b=(int)Math.random()*100;

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 4; j++) {
            a[i][j]=(int)(Math.random()*100);
        }
    }
    for(int n[]:a)
    {
        for(int m:n)
        {
            System.out.print(m +" ");
        }
        System.out.println();
    }
    System.out.println();
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 4; j++) {
            System.out.print(a[i][j] + " ");
        }
        System.out.println();
    }

 }   
}