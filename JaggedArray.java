public class JaggedArray {
    public static void main(String[] args) {
        int a[][]=new int[4][4];
        
        a[0]=new int[3];
        a[1]=new int[2];
        a[2]=new int[4];
        a[3]=new int[2];
        
        // int random=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
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

    // 3D ARRAYS
    System.out.println("3D array");
    int b[][][]=new int[3][4][2];

    for(int i=0;i<b.length;i++)
    {
        for(int j=0;j<b[i].length;j++)
        {
            for(int k=0;k<b[i][j].length;k++)
            {
                b[i][j][k]=(int)(Math.random()*100);
                System.out.println(b[i][j][k]+" ");
            }
        }
    }

    for(int i=0;i<b.length;i++)
    {
        for(int j=0;j<b[i].length;j++)
        {
            for(int k=0;k<b[i][j].length;k++)
            {
                System.out.print(b[i][j][k]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    }
}