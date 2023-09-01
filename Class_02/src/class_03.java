
public class class_03 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 3;
//		arr[3] = 4;
//		arr[4] = 5;
		for (int i =0; i < 5; i++) {
			arr[i] = i+1;
		}
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		for(int i =0; i < 5; i++) {
			System.out.println(arr[i]);
		}
		
		int[] arr2 = new int[400];
		for (int i=0, j=0; i<400; i++, j+=2) {
			arr2[i] = 2*i;
		}
		
		System.out.println();
		int[] arr3 = {1,2,3,4,5,6,7,8,9};
		for(int i=0; i<9; i++)
			System.out.print(arr3[i]+" ");
		

	}

}
// 배열 (Array)
//	변수 : 박스1
//	박스를 이어놓은 것.
//	int[] -> 자료형[] 배열명 = new 자료형[크기]
