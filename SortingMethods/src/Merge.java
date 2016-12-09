
public class Merge {

	public static void main(String[] args) {

		int theArray[] = {4, 2, 5, 1, 3, 18, 0, 9, 6};
		sort(theArray, 0, theArray.length - 1);
		
		for(int i = 0; i < theArray.length; i++){
			System.out.print(theArray[i] + " ");
		}
		System.out.println(" ");

	}
	
	public static void sort(int a[], int left, int right){
		
		if(right == left) return;
		int middle = (left + right) / 2;
		sort(a, left, middle);
		sort(a, middle + 1, right);
		merge(a, left, middle, right);
		
	}
	
	private static void merge(int a[], int left, int middle, int right){
		int tempArray[] = new int[right - left + 1];
		int index1 = left;
		int index2 = middle + 1;
		int indx = 0;
		
		while(index1 <= middle && index2 <= right){
			if(a[index1] < a[index2]){
				tempArray[indx] = a[index1];
				index1++;
			}
			else{
				tempArray[indx] = a[index2];
				index2++;
			}
			indx++;
		}
		while(index1 <= middle){
			tempArray[indx] = a[index1];
			index1++;
			indx++;
		}
		while(index2 <= right){
			tempArray[indx] = a[index2];
			index2++;
			indx++;
		}
		for(indx = 0; indx < tempArray.length; indx++){
			a[left + indx] = tempArray[indx];
		}
	}
}
