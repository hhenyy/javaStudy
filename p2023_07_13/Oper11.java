package p2023_07_13;
//p112 
public class Oper11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//증감 연산자 : ++,--
		
		int a =10, b=10;
		
		System.out.println("a="+a++); //후행연산 a=10 //a출력을 먼저하고 연산
		System.out.println("a="+a); //a=11
		
		System.out.println("b="+(++b)); //선행연산 b=11 //연산을 먼저하고 b출력
		System.out.println("b="+b); //b=11
		
	}

}
