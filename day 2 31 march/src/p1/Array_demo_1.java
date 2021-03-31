package p1;

public class Array_demo_1 {
	
	public static void main(String[] args) {
		
		Array_demo_1 app = new Array_demo_1();
		
		int arr[] = new int[5];
		int i = 0;
		arr = app.insertIntoArray(arr, 77, i++);
		
		app.printArray(arr);
		int data = app.getInformation(arr, 0);
		System.out.println("\n Information "+data);
		
		data = app.getInformation(arr, 4545);
		if(data<0) System.out.println(" Wrong Index");
		
		arr = app.insertIntoArray(arr, 88, i++);
		arr = app.insertIntoArray(arr, 99, i++);
		arr = app.insertIntoArray(arr, 66, i++);
		
		int indexof = app.searchElement(arr,88);
		System.out.println("\n"+indexof);
		
		int minimaxOfArray[] =app.getMinMax(arr);
		app.printArray(minimaxOfArray);
		System.out.println("\n");
		
		int multiplesInArray[] = app.getMultiplesOf(arr, 3);
		app.printArray(multiplesInArray);
		
	}
	
	public void printUsingEnhanceForLoop(int arr[])
	{
		// from java 1.5 onwards
		for (int myElement : arr) {
			myElement = myElement/2; //business operation , 100 lines of code 
			System.out.println(myElement);
		}
	}
	
	
	public int[] insertIntoArray(int arr[],int information,int position)
	{
		
		arr[position] = information;
		return arr;
		
	}
	
	public void printArray(int arr[])
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" "+arr[i]+" ");
		}
	}
	public int getInformation(int arr[],int position)
	{
		if(position>arr.length)
		{
			return -1;
		}
		return arr[position];
	}
	
	// This method accept an array and the element to be searched and return the index value if element found
	// otherwise return -1;
	// as well as return -2 if array is empty
	public int searchElement(int arr[],int key)
	{
		int index=0;
		
		
		if(arr.length == 0)
			return -2;
		else {
			while(index<=arr.length) {
				if(key==arr[index]) {
					
					return index;
					}
				index++;
			}
			
		}
		
		return -1;
	
		
		
	}
	
	/*
	 * this method returns an array of size 2, containing min and max number of the given array, 
	  and below method cannot invoke any other method
	 * Note:- display the returned array using printArray() method 
	 *  */
	public int[] getMinMax(int arr[])
	{
		int min=arr[0],max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i] && arr[i]>0)
				min=arr[i];
			
			if(max<arr[i])
				max=arr[i];
			}
		int array[] ={min,max};
		
		return array;
	}
	
	/*
	 * this method returns an array which contains the multiples of x, 
	  and below method cannot invoke any other method
	 * Note:- display the returned array using printArray() method 
	 *  */
	public int[] getMultiplesOf(int arr[],int x)
	{
		int multiples[] = new int[arr.length];
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%x == 0 && arr[i]!=0) {
				multiples[count]=arr[i];
				count++;
			}
			
		}
		return multiples;
		
	}

}
