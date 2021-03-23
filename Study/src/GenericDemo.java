class Person<T>{
	public T info;
}

public class GenericDemo {

	public static void main(String[] args) {
		Person<String> p1=new Person<String>();
		Person<StringBuilder> p2=new Person<StringBuilder>();
		//인스턴스를 생성할 때 데이터 타입 지정
	}

}
