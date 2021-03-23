class A2{
	public int id;
	A2(int id){
		this.id=id;
	}
}
public class ReferenceDemo {
	public static void runValue() {
		int a=1;
		int b=a;
		b=2;
		System.out.println("runValue, "+a);
	}
	
	public static void runReference() {
		A2 a=new A2(1);
		A2 b=a;
		b.id=2;
		System.out.println("runReference, "+a.id);
	}
	
	public static void main(String[] args) {
		runValue(); //runvalue, 1
		runReference(); //runreference, 2
	}
}
