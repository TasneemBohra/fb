package facebook;

public class MoveAllZeros {
	public static void main(String[] args) {
		int a[] = {0, 4, 0, 5, 0, 0, 0, 1, 0};
		int i = 0, j = a.length - 1;
		while (j >= i) {
			if (a[i] != 0 && a[j] == 0) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			} else if (a[i] == 0) {
				i++;
			} else if (a[j] != 0) {
				j--;
			}
		}
	
	}
}
