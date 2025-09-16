
public class MaxElement {
	public static int maxElement(int arr[]) {
		int max = Integer.MIN_VALUE;
		for(int num : arr) {
			if(num > max) {
				max = num;
			}
		}
		return max;
		
	}
}
