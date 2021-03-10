class Car{
	//필드 정의
	private String color;
	private int speed;
	private int gear;
	public String getColor() {
		return color;
	}
	public void setColor(String c) {
		color=c;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int s) {
		speed=s;
	}
	public int getGear() {
		return gear;
	}
	public void setGear(int g) {
		gear=g;
	}
}
public class CarTest {

	public static void main(String[] args) {
		Car myCar=new Car();   //객체 생성
		
		myCar.setColor("red");       //설정자 메소드 호출
		myCar.setSpeed(100);
		myCar.setGear(1);
		
		System.out.println("현재 자동차의 색상은 "+myCar.getColor());  //접근자 메소드 호출
		System.out.println("현재 자동차의 속도는 "+myCar.getSpeed());
		System.out.println("현재 자동차의 기어는 "+myCar.getGear());
	}
}
