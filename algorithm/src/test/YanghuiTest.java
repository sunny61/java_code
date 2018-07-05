package test;

/**
 * 要求：输出杨辉三角
 * 
 * @author Administration
 * 
 * 
 */
public class YanghuiTest {
	public static void main(String[] args) {
		// 创建二维数组，定义了行，没有定义列
		int[][] arr = new int[10][];
		// 动态为列开辟空间(杨辉三角每行的列数和当前行号是相同的，如：第5行有5列)
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[i + 1];
		}
		// 赋值操作
		for (int i = 0; i < arr.length; i++) {
			arr[i][0] = 1;// 第i行第1列，即每行的第一列都是1
			arr[i][i] = 1;// 第i行的第i列，即每行的最后一个数都是1
			// 接下来是杨辉三角的核心部分
			for (int j = 1; j < i; j++) {// 注意这里的j需要从1开始算起，因为每一行的第一个数我们已经给赋值了
				// 当前数值-->上一行该列的数+上一行该列的左边的第一个数（看图）
				arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
			}
		}
		// 打印输出
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");// 不必换行
			}
			System.out.println("");// 换行
		}
	}
}
