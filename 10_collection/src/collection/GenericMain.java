package collection;

class GenericTest<T>{
	//데이터 타입을 실행할때 결정
	private T a;

	public T getA() {
		return a;
	}

	public void setA(T a) {
		this.a = a;
	}
	
	
}
public class GenericMain {

	public static void main(String[] args) {
		GenericTest<String> aa = new GenericTest<String>();
		aa.setA("홍길동");
		System.out.println("이름 = "+aa.getA());

		//aa.setA(25); //error : String타입으로 생성해줬기 때문에 int타입은 사용불가
		
		GenericTest<Integer> bb = new GenericTest<Integer>();
		bb.setA(25);
		System.out.println("나이 = "+bb.getA());

	}
}
