import java.util.Scanner;
class Searching{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i=0;i<arr.length ; i++) {
			System.out.println("Enter the element for "+(i+1)+" position :-");
			arr[i] = sc.nextInt();
		}	
		System.out.println("Enter the element You Want to Search");
		int num  = sc.nextInt();
		int flag =0;
		int position =0;
		for (int i=0; i<arr.length; i++) {
			if( arr[i] == num){
				flag = 1;
				position = i+1;
			}
		}
		if (flag == 1){
			System.out.println(num+" found at "+position+" position");
		}else{
			System.out.print("Can not find the desired element");
		}
	}
}
class binarySearch{
/* In binary search first we sort the array in increasing order then we diide it into two parts 
if the value of the search is less than the middle element then we search for it the right or 2nd half
and if middle element is big then we find in the 1st or left half */

	public static void main(String[] args) {
		int arr [] = {2,5,8,10,12,16};
		int len = arr.length;
		int z = 12;
		int result = Perform(arr,0,len -1 ,z);
		if(result != -1)
		System.out.println("found  element "+z+" at location:-"+ result);
	}

	static int Perform(int Array[],int l,int r,int x){
		if(r>= l){
			int m = l +(r - l) /2;
			if(Array[m]  == x){
				return m;
			}
			if(Array[m] > x){
				return Perform(Array,l,m -1,x);
			}
			if(Array[m] < x){
				return Perform(Array,m+1,r,x);
			}
		}
		return -1;
	}  
	
}

class Sorting{
	public static void main(String[] args) {
		int arr [] =  {5,1,4,2,8};

		//SelectionSort(arr);
		//BubbleSort(arr);
		//InsertionSort(arr);
		sort(arr,0,arr.length - 1);
		print(arr);


	}	
	public static void SelectionSort(int arr[]){
		/*In this type of sorting we select the minimum element present in the array and
		replace it with the first position and sort the array */
		int test = 0;
		for (int i=0;i<arr.length-1 ;i++ ) { // This loop will run one for the whole array.
			int min_indx = i;
		 	for (int j=i+1;j<arr.length ;j++ ) { //This will loop will run for specified times first
		 		if(arr[j]<arr[min_indx]){
		 			min_indx = j;
		 		}
		 	}
		 int temp = arr[min_indx];
		 arr[min_indx] = arr[i];
		 arr[i] = temp;
		 }
	}
	public static void BubbleSort(int arr[]){
		/* In this type of sorting we compare the first and second and replace them 
		if with each other on satisfying a particular condition. */

		for (int i = 0; i < arr.length-1; i++){  	 //this loop will run one time 
			for (int j = 0; j < arr.length-i-1; j++) //and this loop will run until the specified 
													 //condition is reached for every single time 
													 // of the parent loop .
			{
				if(arr[j] > arr[j+1]){
					int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
				}
			}
		} 
            
	}
	public static void InsertionSort(int arr[]){
		int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
  
            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
	}
}
	public static void mergeSort(int arr[],int l, int m, int r){
		 // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        /* Create temp arrays */
        int L[] = new int[n1]; 
        int R[] = new int[n2]; 
  
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j = 0; j < n2; ++j) 
            R[j] = arr[m + 1 + j]; 
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2) { 
            if (L[i] <= R[j]) { 
                arr[k] = L[i]; 
                i++; 
            } 
            else { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
	}

	public static void sort(int arr[],int l,int r){
		if(l<r){
			int m = (l+r) / 2;
			//sort first and second halves
			sort(arr,l,m);
			sort(arr,m+1,r);

			//merge the two sorted halves
			mergeSort(arr,l, m, r);	
					}
	}
	public static void print(int arr[]){
		for (int i=0; i<arr.length; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println();
	}

}