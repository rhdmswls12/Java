class Car{
	//필드 정의
	String color;
	int speed;
	int gear;
	void print() {
		System.out.println("( "+color+", "+speed+", "+gear+" )");
	}
}

public class CarTest {

	public static void main(String[] args) {
		Car myCar=new Car(); //객체 생성
		
		myCar.color="red";   //객체의 필드 변경
		myCar.speed=0;
		myCar.gear=1;
		myCar.print();       //객체의 메소드 호출
	}

}
