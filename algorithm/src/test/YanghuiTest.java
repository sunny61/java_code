package test;

/**
 * Ҫ������������
 * 
 * @author Administration
 * 
 * 
 */
public class YanghuiTest {
	public static void main(String[] args) {
		// ������ά���飬�������У�û�ж�����
		int[][] arr = new int[10][];
		// ��̬Ϊ�п��ٿռ�(�������ÿ�е������͵�ǰ�к�����ͬ�ģ��磺��5����5��)
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[i + 1];
		}
		// ��ֵ����
		for (int i = 0; i < arr.length; i++) {
			arr[i][0] = 1;// ��i�е�1�У���ÿ�еĵ�һ�ж���1
			arr[i][i] = 1;// ��i�еĵ�i�У���ÿ�е����һ��������1
			// ��������������ǵĺ��Ĳ���
			for (int j = 1; j < i; j++) {// ע�������j��Ҫ��1��ʼ������Ϊÿһ�еĵ�һ���������Ѿ�����ֵ��
				// ��ǰ��ֵ-->��һ�и��е���+��һ�и��е���ߵĵ�һ��������ͼ��
				arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
			}
		}
		// ��ӡ���
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");// ���ػ���
			}
			System.out.println("");// ����
		}
	}
}
