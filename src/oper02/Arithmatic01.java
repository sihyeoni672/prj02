package oper02;

public class Arithmatic01 {

	public static void main(String[] args) {
		
		/*int n1 = 3 + 4 *2;
		System.out.println(n1);
		
		System.out.println(7/2);
		System.out.println(7/2.0);
		System.out.println(0 == 0.0);
		
		int n2 = 0/3;
		System.out.println(n2);
		
		int n3 = 3;
		System.out.println(n3);*/
		
		// Exception :ㅇ 예외, RuntimeError 실행시 오류 발생
		// 이 후 프로그램은 종료되며 실행되지 않는다
		
		// 예외 처리 되었을때
		try {
			int n3 =3/0;
			System.out.println(n3);
		}catch(ArithmeticException e) {
			System.out.println("계산 예외 발생:"+e);
		}catch (Exception e) {
			System.out.println("예외발생:"+ e.getMessage());
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}finally {
			System.out.println("예외상관 없이 무조건 출력된다");
		}
		
		System.out.println("메롱~~~~~~~~");

	}

}
