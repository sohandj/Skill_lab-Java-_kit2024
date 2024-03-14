package day_08;

public class Update {

	static void update(int arr[]) {
		arr[0] = 1000;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {100,200,300,400,500};
		
		update(arr);
		System.out.println(arr[0]);
	}

}
