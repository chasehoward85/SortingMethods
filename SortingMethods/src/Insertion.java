
public class Insertion {

	public static void main(String[] args) {

		int theArray[] = {4, 2, 5, 1, 3, 18, 0, 9, 6};
		sort(theArray);
		
		for(int i = 0; i < theArray.length; i++){
			System.out.print(theArray[i] + " ");
		}
		System.out.println(" ");
		
	}
	
	public static void sort(int a[]){
		
		int itemToInsert, j;
		boolean keepGoing;
		
		for(int i = 1; i < a.length; i++){
			itemToInsert = a[i];
			j = i - 1;
			keepGoing = true;
			while((j >= 0) && keepGoing){
				if(itemToInsert < a[j]){
					a[j + 1] = a[j];
					j--;
					if(j == -1){
						a[0] = itemToInsert;
					}
				}
				else{
					keepGoing = false;
					a[j + 1] = itemToInsert;
				}
			}
		}
	}
}