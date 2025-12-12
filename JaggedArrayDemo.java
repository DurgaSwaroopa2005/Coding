import java.util.Scanner;
class JaggedArrayDemo{
    public static void main(String[] args) {
        int[][] jaggedarray;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int numrows=sc.nextInt();
        jaggedarray=new int[numrows][];
        for(int i=0;i<numrows;i++)
        {
            System.out.println("Enter number of columns in row:"+i);
            int numcols=sc.nextInt();
            jaggedarray[i]=new int[numcols];
            System.out.println("Enter elements for row"+i);
            for(int j=0;j<jaggedarray[i].length;j++)
            {
                jaggedarray[i][j]=sc.nextInt();
            }
        }
       
        System.out.println("JaggedArray");
         for(int i=0;i<numrows;i++)
        {
            for(int j=0;j<jaggedarray[i].length;j++)
            {
                System.out.print(jaggedarray[i][j]+" ");
            }
            System.out.println();
        }
    }

}
