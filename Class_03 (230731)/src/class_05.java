
public class class_05 {

	public static void main(String[] args) {
		int[] arr = new int [7];
		
		for (int i=0; i <7; i++) {
			arr[i] = 0;
		}
		
		for(int i=0,j=0; i <7; i++) {
			int num = (int) (Math.random()*45)+1;
			int check = 0;
			
			//같은 숫자가 없으면 넘어가서 continue, 있다면 break
			for (int k=0; k < j ; k++) {
				if(arr[k] == num) {
					i--;
					check = 1;
					break;
				}
			}

			if(check == 1) {
				continue;
			}

			arr[j++] = num;
			System.out.println(num);
		}
	}
}
//[컴퓨터가 중복없이 사람과 게임을 하는 프로그램]
// 랜덤 난수 1-4를 출력할 수 있ㄷ록 하여, 카드게임을 컴퓨터 vs사람으로 수정해보기.
// (함수화를 할 수 있으면 바꿔보기.)