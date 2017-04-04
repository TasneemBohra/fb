package facebook;

public class RecursiveMultiply {
	public static void main(String[] args) {
		int a = 6;
		int b = 9;
		int sum = a;
		for (int i = 1; i < b; i++) sum+=a;
		System.out.println(sum);
		int dp[] = new int[b];
		System.out.println(add(a, dp, 1));
		
	}
	
	private static int add(int a, int[]dp, int index) {
		System.out.println(index);
		if (dp.length > index) {
			if (dp[index] == 0) {
				dp[index+1] = dp[index] + a;
				System.out.println(dp[index]);
			
			}
		}
		return dp[index-1];
	}
}
