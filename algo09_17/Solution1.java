package algo09_17;

public class Solution1 {
	//기존 작성 코드
	  public int[] solution(long n) {
	        int arr[] = new int[12];
	        int i = 0;
	        while (n > 0) {
	            int digit = (int) (n % 10);
	            n = n / 10;
	            arr[i] = digit;
	            System.out.print(arr[i] + "");
	            i++;
	        }
	        int result[] = new int[i];
	        for (int j = 0; j < i; j++) {
	            result[j] = arr[j];
	        }
	        return result;
	    }
}
