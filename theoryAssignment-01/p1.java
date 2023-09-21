import java.util.Scanner;
public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        System.out.print("Enter no. of elements in the array: ");
        int num = sc.nextInt();
        int [] arr = new int[num];
        System.out.print("Enter all the "+num+" array element: ");
        for(int i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the key: ");
        int key = sc.nextInt();
        
        for(int i=0;i<num;i++)
        {
            if(key==arr[i])
            {
                count++;
            }
            else
            {
                count=0;
            }
        }
        System.out.println(key+" appears "+count+" no. of times.");
    }
}
