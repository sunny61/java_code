package test;

public class test {
	public static void main(String[] args) {
		int[][] arr = new int[10][];
		for (int i = 0; i < arr.length; i++) {
			// ��̬Ϊ�п��ٿռ�(�������ÿ�е������͵�ǰ�к�����ͬ�ģ��磺��5����5��)
			arr[i] = new int[i + 1];
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i][0] = 1;
			arr[i][i] = 1;
			for (int j = 1; j < i; j++) {
				arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];

			}
		}
		// ��ӡ���
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("");// ����
		}

	}
}
