
public class MaxElement {
	public static int maxElement(int arr[]) {
		//int max = Integer.MIN_VALUE;
		//int max = arr[0];
		int max = 0;
		for(int num : arr) {
			if(num > max) {
				max = num;
			}
		}
		return max;
		
	}
}
