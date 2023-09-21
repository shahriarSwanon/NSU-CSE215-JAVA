import java.util.Scanner;
public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matrix = new int [5][5];
        System.out.println("Enter a 5-by-5 matrix row by row: ");
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
        int sumOfMajorDiagonal=0;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(i==j)
                {
                    sumOfMajorDiagonal=sumOfMajorDiagonal+matrix[i][j];
                }
            }
        }
        int sumOfMinorDiogonal=0;
        for(int i=0;i<5;i++)
        {
            sumOfMinorDiogonal=sumOfMinorDiogonal+matrix[i][5-1-i];
        }
        System.out.println("Sum of the elemetns in the major diagonal: "+sumOfMajorDiagonal);
        System.out.println("Sum of the elemetns in the minor diagonal: "+sumOfMinorDiogonal);
    }
}
