class Car{
	private String color;
	private int speed;
	private int gear;
	//생성자를 선언하지 않았으므로 컴파일러가 자동으로 디폴트 생성자를 만든다.
}
public class CarTest{
	public static void main(String args[]) {
		Car c1=new Car(); //디폴트 생성자 호출
	}
}
