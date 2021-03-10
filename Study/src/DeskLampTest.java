class DeskLamp{
	private boolean isOn;
	void turnOn() {
		isOn=true;
	}
	void turnOff() {
		isOn=false;
	}
	public String toString() {
		return "현재 상태는 "+(isOn==true?"켜짐":"꺼짐");
	}
}
public class DeskLampTest {

	public static void main(String[] args) {
		DeskLamp myLamp=new DeskLamp();
		myLamp.turnOn();
		System.out.print(myLamp);
	}

}
