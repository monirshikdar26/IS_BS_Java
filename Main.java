import java.util.Scanner;
import java.util.Arrays;

public class Main
{
public static void main(String []args)
{
Scanner input = new Scanner(System.in);

InsertionSort is = new InsertionSort();
BinarySearch bs = new BinarySearch();

System.out.println("Enter the length of Array: ");
int length = input.nextInt();

int []A = new int[length];

System.out.println("Enter the element of Array: ");

for(int i=0;i<length;i++)
A[i] = input.nextInt();

is.insertion(A);
System.out.print(Arrays.toString(A));

int start = 0;
int end = length-1;

bs.binarySearch(A,start,end);
}
}
