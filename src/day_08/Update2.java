package day_08;

public class Update2 {

	
	static void change(int arr[], int index, int value) {
		arr[index] = value;
	}
	public static void main(String[] args) {
		int arr[] = {2,4,6,8,10};
		change(arr,2,20);
		for(int x:arr) {
			System.out.println(x + " ");
		}
	}

}
