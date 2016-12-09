
public class Selection {

	public static void main(String[] args) {

		int theArray[] = {4, 2, 5, 1, 3, 18, 0, 9, 6};
		sort(theArray);
		
		for(int i = 0; i < theArray.length; i++){
			System.out.print(theArray[i] + " ");
		}
		System.out.println(" ");
		
	}
	
	public static void sort(int a[]){
		
		int min, minIndex;
		for(int i = 0; i < a.length; ++i){
			min = a[i];
			minIndex = i;
			for(int j = i + 1; j < a.length; ++j){
				if(a[j] < min){
					min = a[j];
					minIndex = j;
				}
			}
		a[minIndex] = a[i];
		a[i] = min;
		}
	}
}
