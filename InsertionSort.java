public class InsertionSort
{

public void insertion(int []A)
{
for(int i=1;i<A.length;i++)
{
int item = A[i];
int j= i-1;
while(j>-1 && A[j]>item)
     {
	A[j+1] = A[j];
	j= j-1;
     }
A[j+1] = item;
}

}

}

