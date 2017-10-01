package insertionsort;
/*   
	Author: Chan In Kou
	Purpose: This program will sort an array list with insertion sort 
*/
public class InsertionSorting {

	public static void main(String[] args) 
	{
		// giving an example array
		int array[] = {4, 3,2, 5, 1};
		
		// calling insertion sorting
		insertionSort(array);
		
		// printing out the array
		printingTheArray(array);
	}
	
	public static void insertionSort(int array[])
	{
		// declaring variables
		int j;
		int key;
		int i;
		
		//checking each element in the list and swap them around.
		for (j = 1; j < array.length; j++)
		{
			key = array[j];
			i = j-1;
			while (i >= 0 && array[i] > key)
			{
				array[i+1] = array[i];
				i = i-1;
			}
			array[i+1] = key;
		}
	}
	
    public static void printingTheArray(int array[])
    {
        for (int i = 0; i < array.length; i++)
        {
        	 System.out.print(array[i] + " ");
        }
    }
}
