package p2023_07_17;

public class Continue03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//continue 문을 이용해서 1~100까지 정수 중에서 5의 배수만 출력하는
		//프로그램을 작성 하세요.
		
		for (int i=1; i<=100; i++) {
			if (i%5!=0) continue;  //5의 배수가 아니면 반복문으로 돌아감.
			System.out.println("5의배수:"+i);
		}

	}

}
