package test;

public class test {
	public static void main(String[] args) {
		int[][] arr = new int[10][];
		for (int i = 0; i < arr.length; i++) {
			// 动态为列开辟空间(杨辉三角每行的列数和当前行号是相同的，如：第5行有5列)
			arr[i] = new int[i + 1];
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i][0] = 1;
			arr[i][i] = 1;
			for (int j = 1; j < i; j++) {
				arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];

			}
		}
		// 打印输出
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("");// 换行
		}

	}
}
