package q3;

//Rotate array left by d positions
public class Array_Left_Rotation {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 8, 10, 12, 24, 46, 68, 80 };
		int d = 5;
		System.out.println("Before Left Rotation: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("After Left Rotation: ");
		for (int i = 0; i < d; i++) {
			int temp = arr[0];
			for (int j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[arr.length-1] = temp;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
